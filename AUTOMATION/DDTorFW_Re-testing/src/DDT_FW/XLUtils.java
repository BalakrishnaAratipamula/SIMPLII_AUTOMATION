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

public class XLUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;

//to specify working File and Sheet
public static void setExcelFile(String xlfile,String xlsheet) throws Exception {

	try {
	   	FileInputStream ExcelFile = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(ExcelFile);
		ws = wb.getSheet(xlsheet);
		}
	catch(Exception e){
			throw (e);
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
			DataFormatter formatter = new DataFormatter();
			String cellData = formatter.formatCellValue(cell);
			return cellData;
		}
		catch (Exception e)
		{
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
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	String path="F:\\Mercury login data.xlsx";    //‪F:\mercury login data.xlsx
	XLUtils.setExcelFile(path, "Sheet1");
	int rows=XLUtils.getRowCount(path, "Sheet1");
	for(int i=1; i<=rows; i++) {
		
		String username=XLUtils.getCellData(path, "Sheet1", i, 0);//i-rownum, 0-colnum (having username validation data)
		String pwd=XLUtils.getCellData(path, "Sheet1", i, 1);//i-rownum, 1-colnum (having password validation data)

		//to perform login operation	
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		Thread.sleep(8000);
		//to read page title
		String pgTitle=driver.getTitle();
		if(pgTitle.equals("Find a Flight: Mercury Tours:")) {
			System.out.println("Test passed");
			XLUtils.setCellData(path, "Sheet1", i, 2, "Successful login operation");
			driver.findElement(By.linkText("SIGN-OFF")).click();	
		}
		else {
			System.out.println("Test Failed");
			XLUtils.setCellData(path, "Sheet1", i, 2, "Unsuccessful login operation");
		}
		driver.findElement(By.linkText("Home")).click();
	}
}
}
