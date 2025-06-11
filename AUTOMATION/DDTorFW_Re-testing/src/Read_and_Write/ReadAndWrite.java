package Read_and_Write;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

// @.Write a Java code to copy the emp id from the first excel sheet having emp name and emp id, and paste copied emp name into another excel sheet have emp name only based on the emp name?
public class ReadAndWrite {
	public static void main(String[] args) throws Exception {
        String filePath = "F://EmployeeData.xlsx"; // Same Excel file with two sheets

        FileInputStream fis = new FileInputStream(filePath);
        Workbook wb = new XSSFWorkbook(fis);

        Sheet sourceSheet = wb.getSheet("Sheet1"); // Contains EmpName and EmpId
        Sheet targetSheet = wb.getSheet("Sheet2"); // Contains only EmpName

        Map<String, String> empMap = new HashMap<>();

        // Read from Sheet1 and store in map
        for (Row row : sourceSheet) {
            if (row.getRowNum() == 0) continue; // Skip header
            org.apache.poi.ss.usermodel.Cell nameCell = row.getCell(0); //col1
            org.apache.poi.ss.usermodel.Cell idCell = row.getCell(1); //col2
            if (nameCell != null && idCell != null) {
                empMap.put(((org.apache.poi.ss.usermodel.Cell) nameCell).getStringCellValue().trim(), ((org.apache.poi.ss.usermodel.Cell) idCell).getStringCellValue().trim());
            }
        }
        System.out.println("Sheet 1 Employee Name's and ID's -Reading- done successfully.");
        
        // Write EmpId into Sheet2 based on EmpName
        for (Row row : targetSheet) {
            if (row.getRowNum() == 0) 
            	continue; // Skip header
            	org.apache.poi.ss.usermodel.Cell nameCell = row.getCell(0);
            if (nameCell != null) {
                String name = ((org.apache.poi.ss.usermodel.Cell) nameCell).getStringCellValue().trim();
                String empId = empMap.get(name); //get 'name' value from HasnMap
                
                if (empId != null) {
                    org.apache.poi.ss.usermodel.Cell idCell = row.createCell(1); // Assume empId goes in column B
                    ((org.apache.poi.ss.usermodel.Cell) idCell).setCellValue(empId);
                }
            }
        }

        fis.close();

        // Save the changes
        FileOutputStream fos = new FileOutputStream(filePath);
        wb.write(fos);
        wb.close();
        fos.close();
        
        System.out.println("Sheet 2 Employee ID's are -Written- based on Name's successfully.");
    }

}
