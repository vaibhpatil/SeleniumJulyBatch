package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
  @Test
  public void ChromeBrowserTeSt() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
  }
  @Test
  public void EdgeBrowserTest() {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://www.google.in");
	  driver.get("https://www.facebook.in");
	  
  } 
  
}
