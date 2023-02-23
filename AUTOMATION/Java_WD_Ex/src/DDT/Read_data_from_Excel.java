package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class Read_data_from_Excel {
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
	System.out.println();
	
	//to print excel cell data
	for(int row=0; row<=row_num; row++) { //Row starts from 1  /////'row_num' iterations are enough bcz count except header
		//to specify Row to focus
		XSSFRow myRow = ws.getRow(row);
		for(int col=0; col<=col_num-1; col++) { //col start from 0
			String myData = myRow.getCell(col).toString(); 
			System.out.print(myData+"   ");
		}
		System.out.println();
	}
	
}
}
