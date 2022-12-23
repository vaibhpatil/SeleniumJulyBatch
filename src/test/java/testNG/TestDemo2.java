package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo2 {
  @Test(priority=1)
  public void googleTest() {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.google.com");
	   System.out.println("Title is: " +driver.getTitle());
	   
  }
      @Test(priority=2,invocationCount=2)

      public void facebookTest()
      {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.facebook.com");
    	System.out.println("Title is :"+driver.getTitle());
      }
}

