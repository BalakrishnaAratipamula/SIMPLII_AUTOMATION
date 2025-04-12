package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
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
}
