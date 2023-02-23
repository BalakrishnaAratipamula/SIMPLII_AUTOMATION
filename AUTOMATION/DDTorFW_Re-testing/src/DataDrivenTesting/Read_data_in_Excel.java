package DataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class Read_data_in_Excel {
public static void main(String[] args) throws Exception {
		//to specify File location
		FileInputStream fi= new FileInputStream("F://mydata5.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fi);																																	//if 'fi' not mention get NullpointerException
		XSSFSheet ws=wb.getSheet("Student_Details");
		
		//to find Number of Rows & columns
		int row_num=ws.getLastRowNum();//here row count as except header will consider
		int col_num=ws.getRow(0).getLastCellNum();																																//have to choose any row bcz all rows containing equal columns i.e, getRow(1) (or) getRow(2) (or) -----------
		System.out.println("Number of Rows are: "+(row_num+1));																												//while printing time header will not consider. '+1'means concatinate '1' bcz index will starts from '0' so by adding '+1' will get row count 
		System.out.println("Number of Columns are: "+col_num);
		
		for(int row=0; row <= row_num; row++) {//'row_num' iterations are enough bcz count except header so no need to take '-1'
			//to specify Row to focus
			XSSFRow myRow= ws.getRow(row);
			for(int col=0; col<=myRow.getLastCellNum()-1; col++) {
				String cellData=myRow.getCell(col).toString();
				System.out.print(cellData+"   ");
			}

			System.out.println();
			
		}
		
		wb.close();
		fi.close();
	}
}
