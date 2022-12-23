package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	 @BeforeClass
		public void setup()
		{
			    WebDriverManager.chromedriver().setup();
			    driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/");
				driver.manage().window().maximize();
		}

	  @BeforeMethod
	  public void apptitle()
	  {
		   System.out.println(driver.getTitle());
	  }
	  
	   @AfterMethod
	   public void appCurrenturl()
	   {
		   System.out.println(driver.getCurrentUrl());
	   }
	  
	  @AfterClass
	  public void teardown()
	  {
		 driver.quit();   
	  }
	

}
