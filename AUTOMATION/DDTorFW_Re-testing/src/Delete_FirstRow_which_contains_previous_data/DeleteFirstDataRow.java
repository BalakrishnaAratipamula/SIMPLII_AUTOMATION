package Delete_FirstRow_which_contains_previous_data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DeleteFirstDataRow {
	public static void main(String[] args) throws IOException {
        String filePath = "F://example.xlsx";
        int rowIndexToDelete = 1; // 0-based index; row 4 in Excel
        
        FileInputStream fis = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0); // First sheet
        
        XSSFRow rowToDelete = sheet.getRow(rowIndexToDelete);
        if (rowToDelete != null) {
            sheet.removeRow(rowToDelete);

            /*/ If you want to shift rows up after deleting: /////below code is not working properly need to check
            int lastRowNum = sheet.getLastRowNum();
            if (rowIndexToDelete < lastRowNum) {
                sheet.shiftRows(rowIndexToDelete + 1, lastRowNum, -1); //(startRow, endRow, int)
            } //*/
        }

        fis.close();
        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);
        fos.close();
        workbook.close();

        System.out.println("Row " + (rowIndexToDelete + 1) + " deleted successfully.");
    }
}
