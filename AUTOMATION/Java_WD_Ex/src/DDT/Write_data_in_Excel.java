package DDT;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class Write_data_in_Excel {
public static void main(String[] args) throws IOException {
	//to specify file location
	FileOutputStream fo = new FileOutputStream("F:\\mydata456_FromEclipse.xls");
	//to create Workbook
	HSSFWorkbook wb = new HSSFWorkbook();
	//to create Sheet
	HSSFSheet ws = wb.createSheet("Student_Details");

	
	//to specify first row
	HSSFRow row1 = ws.createRow(0);
	//to enter data in cell
	row1.createCell(0).setCellValue("St_Name"); //in row1 create cell '0' and set call value is 'St_Name'
	row1.createCell(1).setCellValue("Subject");
	row1.createCell(2).setCellValue("Grade");
	
	//to specify 2nd row
	HSSFRow row2=ws.createRow(1);
	//to enter data in cell
	row2.createCell(0).setCellValue("Kirannnnnnnn");
	row2.createCell(1).setCellValue("Selenium");
	row2.createCell(2).setCellValue("A");	
	
	//to specify 3rd row
	HSSFRow row3=ws.createRow(2);
	//to enter data in cell
	row3.createCell(0).setCellValue("Ramya");
	row3.createCell(1).setCellValue("QTP");
	row3.createCell(2).setCellValue("B");
		
	//to specify 4th row
	HSSFRow row4=ws.createRow(3);
	//to enter data in cell
	row4.createCell(0).setCellValue("Bhanu");
	row4.createCell(1).setCellValue("Java");
	row4.createCell(2).setCellValue("C");
	
	//to create physical copy
	wb.write(fo);
	//to de-allocate memory
	wb.close();
	fo.close();
	
	System.out.println("Writing data in Excel completed");
	
}
}