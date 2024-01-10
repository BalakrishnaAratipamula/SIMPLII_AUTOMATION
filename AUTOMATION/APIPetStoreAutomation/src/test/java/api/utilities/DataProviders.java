package api.utilities;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	//to get entire data
	@DataProvider(name="Data")	//specifying some name to Dataprovider
	public String[][] getAllData() throws FileNotFoundException, IOException{
		
		String path = System.getProperty("user.dir")+"//testData//Userdata.xlsx";	   //System.getProperty("user.dir") - give us current proj location
		XLUtility xl = new XLUtility(path);    //bcz of this 'XLUtility' constructor will get 'path' from here and use this 'path' in entire class 
		
		int rownum = xl.getRowcount("Sheet1");
		int colcount = xl.getCellcount("sheet1", 1);	//'R0'- is header so '1' will rep row count take from 'R1'
		
		String apidata[][] = new String [rownum][colcount];
		
		for(int i=1; i<=rownum; i++) {
			for(int j=0; j<colcount; j++) {
				apidata[i-1][j] = xl.getCellData("Sheet1", i, j);	//(sheet, row, col) //all data will store in the 2-D Array
				
			}
			
		}
		
		return apidata;
	}
	
	
	//to get 'UserNames' - bcz we have to perform operations based on 'userName' only as requirement
	@DataProvider(name="UserNames")   //specifying some name to Dataprovider
	public String[] getUserNames() throws FileNotFoundException, IOException{	//1-D bcz only user name we want
		
		String path = System.getProperty("user.dir")+"//testData//Userdata.xlsx";
		XLUtility xl = new XLUtility(path);
		
		int rownum = xl.getRowcount("Sheet1");
		
		String apidata[] = new String [rownum];
		
		for(int i=1; i<=rownum; i++) {
			
			apidata[i-1] = xl.getCellData("sheet1", i, 1);	//(sheet, row, col) - userName is 'c1' in excel
		}
		
		return apidata;
	}
	
}
