package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
  @Test
  public void hardAssert () 
  {
	  String act ="Selenium Webdriver is  WenUI Automation Library.";
	  String exp="TestNG.";
	  
	  Assert.assertFalse(act.contains(exp));
	  
	  Assert.assertFalse(act.contains(exp));
	  System.out.println("Hard Assert demo is completed");
	  
  }

    
  @Test
  public void softAssert()
  
  {
	  SoftAssert sf=new SoftAssert();
	  String act="Selenium Webdriver is WebUI automatipn library";
	  String exp="JAVA";
	  
	  sf.assertFalse(act.contains(exp),"Expected String is not available");
	  System.out.println("Soft Assert Demo Completed");
	  
	  sf.assertAll();
	  
	  
	  
  }
}  