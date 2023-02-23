package DDT_FW;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XLUtilss {
	
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static FileInputStream fi;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static FileOutputStream fo;
	
//to specify working file and sheet
public static void setExcelFiles(String xlfile, String xlsheet) throws Exception {
	try {
		FileInputStream ExcelFile = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(ExcelFile);
		ws = wb.getSheet(xlsheet);
	}
	catch(Exception e) {
		throw(e);
	}
}

//To find number of Rows availability in a specified sheet
public static int getRowCount(String xlfile,String xlsheet) throws Exception {
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		int rowcount=ws.getLastRowNum();
		
		wb.close();
		fi.close();
		
		return rowcount;		
	}
	
//to find number cells availability in a specified Row
public static int getCellCount(String xlfile,String xlsheet,int rownum) throws Exception{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		int cellcount=row.getLastCellNum();
		
		wb.close();
		fi.close();
		
		return cellcount;
	}

//to read cell value
public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws Exception{
	fi=new FileInputStream(xlfile);
	wb=new XSSFWorkbook(fi);
	ws=wb.getSheet(xlsheet);
	row=ws.getRow(rownum);
	cell=row.getCell(colnum);
	
	String data;
	try {
		DataFormatter formater = new DataFormatter();
		String cellData = formater.formatCellValue(cell);
		return cellData;
	}
	catch(Exception e) {
		data="";
	}
	wb.close();
	fi.close();
	return data;
}

//to set value
public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws Exception{
	fi=new FileInputStream(xlfile);
	wb=new XSSFWorkbook(fi);
	ws=wb.getSheet(xlsheet);
	row=ws.getRow(rownum);
	cell=row.createCell(colnum);
	cell.setCellValue(data);
	fo=new FileOutputStream(xlfile);
	wb.write(fo);		
	wb.close();
	fi.close();
	fo.close();
}


public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://newtours.demoaut.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	String path="F:\\Mercury login data.xlsx";
	XLUtilss.setExcelFiles(path, "Sheet1");
	int rows=XLUtilss.getRowCount(path, "Sheet1");
	for(int i=1; i<=rows; i++) {
		
		String un=XLUtilss.getCellData(path, "Sheet1", i, 0);//i-rownum, 0-colnum (having username validation data)----get
		String pwd=XLUtilss.getCellData(path, "Sheet1", i, 1);//i-rownum, 1-colnum (having password validation data)-----get
		
		//to perform login operation
		driver.findElement(By.name("userName")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		Thread.sleep(9000);
		//to read pagetitle
		String pgTitle=driver.getTitle();
		if(pgTitle.equals("Find a Flight: Mercury Tours:")) {
			System.out.println("Test Passed");
			XLUtilss.setCellData(path, "Sheet1", i, 2, "Sucessful login operation");//i-rownum, 2-colnum---set
			driver.findElement(By.linkText("SIGN-OFF")).click();//after login we will get 'SIGN-OFF' link
		}
		else {
			System.out.println("Test Failed");
			XLUtilss.setCellData(path, "Sheet1", i, 2, "Unsucessful login operation");//i-rownum, 2-colnum---set
		}
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(3500);
	}
	System.out.println("***********Please check Excel sheet*********");
}

}


















