package testNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotDemo {
  @Test
  public void capture() throws IOException {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  //Screenshot
	  
	  TakesScreenshot ts =(TakesScreenshot)driver;
	  
	  File temp= ts.getScreenshotAs(OutputType.FILE);
	  File dest=new File("./"+"\\Scrrenshots\\pic.png");
	  
	  FileHandler.copy(temp, dest);
	  
	  System.out.println("Screenshot is captured");
	  
	  
	  
  }
}
