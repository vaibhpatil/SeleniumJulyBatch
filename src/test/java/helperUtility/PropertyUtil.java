package helperUtility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtil {

   public static Properties propertyRead()
{     Properties p1=new Properties();
	  File f1=new File("./"+"\\Config.properties");
	  try {
	  FileInputStream fs=new FileInputStream(f1); 
	   p1.load(fs);
	  }catch(Exception e)
	  
	  {
		  System.out.println("Check File Path or Check Load Process ");
	  }
	  return p1;

}
}

