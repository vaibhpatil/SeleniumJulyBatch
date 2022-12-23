package dataDrivenFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import helperUtility.Screenshotutility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HrmDataDrivenTest {
 // @Test(dataProvider="testdata1",dataProviderClass=CustomData.class)
    @Test(dataProvider="exceldata",dataProviderClass=CustomData.class)
 public void hrmLogin(String un,String psw) 
  {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();	
		
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(psw);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Screenshotutility.capture(driver); 
		System.out.println(driver.getCurrentUrl());
		
		//Validation
		String act=driver.getCurrentUrl();
		String exp="dashboard/index";
		
		Assert.assertTrue(act.contains(exp));
		
		
  }
}
