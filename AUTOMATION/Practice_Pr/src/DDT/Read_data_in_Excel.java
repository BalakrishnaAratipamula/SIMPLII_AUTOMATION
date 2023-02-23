package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class Read_data_in_Excel {
public static void main(String[] args) throws IOException {
	//to specify location of file
	FileInputStream fi = new FileInputStream("F:\\mydata123.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fi);
	XSSFSheet ws = wb.getSheet("Student_Details");
	
	//to find num of rows & columns
	int row_num = ws.getLastRowNum();
	int col_num = ws.getRow(0).getLastCellNum();
	System.out.println("Num of Rows are: "+(row_num+1));
	System.out.println("Num of columns are: "+col_num);

	for(int row=0; row<=row_num; row++) {
		XSSFRow myRow = ws.getRow(row);
		for(int col=0; col<=col_num-1; col++) {
			String myData = myRow.getCell(col).toString();
			System.out.print(myData+"   ");
		}
		System.out.println();
	}
}
}
