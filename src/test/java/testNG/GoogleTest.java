package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
  @Test
  public void ChromeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println("Title Is"+driver.getTitle());
	  
  }
}
