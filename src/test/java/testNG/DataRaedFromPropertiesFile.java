package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DataRaedFromPropertiesFile 
{
  @Test
  public void TestCase() throws IOException 
  {
	   //To Setup File
	  File f1=new File("./"+"\\Config.properties");
	  
	  // Read
	  FileInputStream fs= new FileInputStream(f1);
	  
	  Properties p1= new Properties();
	  p1.load(fs);
	  
	  System.out.println("Browser Name:"+p1.getProperty("bname"));
	  System.out.println("Browser version:"+p1.getProperty("bversion"));
	  System.out.println("Broswer Platform is"+p1.getProperty("platform"));
	  
	  
	  
  }
}
