package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class E02_ReadDataFromExcelFile {
	public static void main(String[] args) throws IOException {
		//To specify the file location
		FileInputStream fi = new FileInputStream("F://myData7.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("StudentData");
		
		//To find the number of Rows & Columns
		int rowNum = ws.getLastRowNum(); //here row count will capture by ignoring header
		int colNum = ws.getRow(0).getLastCellNum(); //getRow(0) bcz each row having same number of columns
		
		System.out.println("Number of Rows are:  "+(rowNum+1));
		System.out.println("Number of Columns are:  "+colNum);
		
		//to print cell data
		//for Row iteration
		for(int row=0; row<=rowNum; row++) {
			//to specify the Row to focus
			XSSFRow myRow = ws.getRow(row); 
			//for column iteration
			for(int col=0; col<=myRow.getLastCellNum()-1; col++) {
				String cellData = myRow.getCell(col).toString();
				//Printing cell data
				System.out.print(cellData+"    ");
			}
			System.out.println(); //to eneter into next line
		}
		
		wb.close();
		fi.close();
	}
}
