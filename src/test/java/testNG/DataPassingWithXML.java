package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;

public class DataPassingWithXML {
  @Parameters({"un","psw"})
  @Test
  public void testCase(String un,String psw)
  {
	  System.out.println("User Name Is: "+un);
	  System.out.println("Password Is :" +psw);
  }
  
  @Parameters({"un1","psw1"})
  @Test
  public void hrmLogin(String un1,String psw1)
  {

	    WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("");
		driver.manage().window().maximize();	
		
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un1);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(psw1);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
		
  }
}
