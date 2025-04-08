package DataDrivenTesting;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class E01_WriteDataIntoExcelFile {
public static void main(String[] args) throws Exception {
		//to specify File location
		FileOutputStream fo= new FileOutputStream("F://mydata5.xlsx");
	//	FileOutputStream fo = new FileOutputStream("F:\\mydata123.xlsx");
		
		//to create Workbook
		XSSFWorkbook wb= new XSSFWorkbook(); //represents Excel/Notepad/word
		
		//to create sheet
		XSSFSheet ws= wb.createSheet("Student_Details");
		
		
		//to specify 1st row
		XSSFRow row1=ws.createRow(0);
		//to enter data in cell
		row1.createCell(0).setCellValue("St_Name");
		row1.createCell(1).setCellValue("Subject");
		row1.createCell(2).setCellValue("Grade");
		
		//to specify 2nd row
		XSSFRow row2=ws.createRow(1);
		//to enter data in cell
		row2.createCell(0).setCellValue("Kiran3");
		row2.createCell(1).setCellValue("Selenium");
		row2.createCell(2).setCellValue("A");		
		
		//to specify 3rd row
		XSSFRow row3=ws.createRow(2);
		//to enter data in cell
		row3.createCell(0).setCellValue("Ramya");
		row3.createCell(1).setCellValue("QTP");
		row3.createCell(2).setCellValue("B");

		
		//to specify 4th row
		XSSFRow row4=ws.createRow(3);
		//to enter data in cell
		row4.createCell(0).setCellValue("Bhanu");
		row4.createCell(1).setCellValue("Java");
		row4.createCell(2).setCellValue("C");

		//to create physical copy
		wb.write(fo);
		//to deallocate memory
		wb.close();
		fo.close();
		System.out.println("Writing data in Excel completed");
	}
}
