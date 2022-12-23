package FrameWorkDesign;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass{
  @Test
  public void testCase1() 
  {
	  LoginPage lp=new LoginPage(driver);
	  lp.doLogin("Admin","admin123");
  }
}
