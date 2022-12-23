package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData {
	public XSSFWorkbook wb;
	@DataProvider(name="testdata1")
	public Object[][]testdata()
	{
		Object arr[][]= {{"Admin","admin123"},{"vaibhav","vaibhav123"},{"Admin","admin123"},{"harshu","harshu123"},{"bhima123","bhima"}};
        return arr;	
	}
	 
	@DataProvider(name="exceldata")
	public Object[][] excelFile()
	{
		 
		  File f1=new File("./"+"\\TestData\\Data.xlsx");
		  try {
		  FileInputStream fs=new FileInputStream(f1) ;
		
		  //Workbook--->sheet---->row---->Value
		  
		   wb=new XSSFWorkbook(fs);
		  }catch(Exception e)
		  {
			  System.out.println("Check The File Path");
		  }
		  
		  
		  //Passing all Data one time
		  
		  // Number of rows
		   
		  int rows=  wb.getSheet("userdata").getPhysicalNumberOfRows();
		  
		  //Number of cells
		  int cells= wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
		   
		   //store all data from file to array
		   Object arr[][]=new Object[rows][cells];
		   for(int i=0;i<arr.length;i++)
		   {
			   for(int j=0;j<arr[i].length;j++)
			   {
			   arr[i][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue(); 
			   
			   }
		   
			   
		   }
		  
		   return arr;
		  
	 
	  }
	

	}
	


