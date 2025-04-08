package testCases;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class E01_WriteDataIntoExcelFile {
	public static void main(String[] args) throws IOException {
		//To specify the file location
		FileOutputStream fo = new FileOutputStream("F://myData7.xlsx");
		//to create workbook
		XSSFWorkbook wb = new XSSFWorkbook();
		//to create sheet
		XSSFSheet ws = wb.createSheet("StudentData");
		
		//to specify 1st row
		XSSFRow row1 = ws.createRow(0); //Row 1 index - 0
		//to set data in cell
		row1.createCell(0).setCellValue("st_name");
		row1.createCell(1).setCellValue("Subject");
		row1.createCell(2).setCellValue("Grade");
		
		//to specify 2nd row
		XSSFRow row2 = ws.createRow(1); // Row 1 index - 0
		// to set data in cell
		row2.createCell(0).setCellValue("Ramesh");
		row2.createCell(1).setCellValue("Selenium");
		row2.createCell(2).setCellValue("C");
		
		//to specify 3rd row
		XSSFRow row3 = ws.createRow(2); // Row 1 index - 0
		// to set data in cell
		row3.createCell(0).setCellValue("Varsha");
		row3.createCell(1).setCellValue("Java");
		row3.createCell(2).setCellValue("A");
		
		//to specify 4th row
		XSSFRow row4 = ws.createRow(3); // Row 1 index - 0
		// to set data in cell
		row4.createCell(0).setCellValue("Daniel");
		row4.createCell(1).setCellValue("C#");
		row4.createCell(2).setCellValue("B");
		
		//to specify 5th row
		XSSFRow row5 = ws.createRow(4); // Row 1 index - 0
		// to set data in cell
		row5.createCell(0).setCellValue("Siman");
		row5.createCell(1).setCellValue("Python");
		row5.createCell(2).setCellValue("A");
		
		//to create physical copy
		wb.write(fo);
		
		//to deallocate memory
		wb.close();
		fo.close();
		
		System.out.println("Writing data in Excel sheet is completed");
	}
}




