package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataRead {
  @Test
  public void dataRead() throws IOException 
  {
	  
	  File f1=new File("./"+"\\TestData\\Data.xlsx");
	  FileInputStream fs=new FileInputStream(f1) ;
	  
	  //Workbook--->sheet---->row---->Value
	  
	  XSSFWorkbook wb = new  XSSFWorkbook(fs);
	  //passing data by chaining method
	  //String value=wb.getSheet("userdata").getRow(0).getCell(1).getStringCellValue();
	  //System.out.println(value);
	  
	  //XSSFSheet sheet1=wb.getSheet("userdata");
	  //XSSFRow row1=sheet1.getRow(1);
	  //XSSFCell cell1=row1.getCell(0);
	  //String value =cell1.getStringCellValue();
	  //System.out.println(value);
	  
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
		   System.out.print(arr[i][j]+"|\t");
		   
		   }
	   
		   System.out.println();
	   }
	  
	  
 
  }
}
