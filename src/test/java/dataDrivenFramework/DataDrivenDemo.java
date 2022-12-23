package dataDrivenFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenDemo {
	
	
  @Test(dataProvider="testdata1",dataProviderClass = CustomData.class)
  public void testCase(String un, String psw) 
  {
	  System.out.println("Hello Your User name is"+un);
	  System.out.println("Hello Youe Password is"+psw);
	   
  }
}
