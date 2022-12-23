package FrameWorkDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	//Initialize driver
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// Identification + Action
	
     private By un= By.name("username");
     private By psw=By.name("password");
     private By btn=By.xpath("//button[@type='submit']");
     
     public void doLogin(String un1, String psw1)
     {
    	 driver.findElement(un).sendKeys(un1);
    	 driver.findElement(psw).sendKeys(psw1);
    	 driver.findElement(btn).click(); 
     
	}
    }


