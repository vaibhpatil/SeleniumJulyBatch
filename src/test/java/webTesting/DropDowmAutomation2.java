package webTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowmAutomation2 {
	public static void main(String[]args)
	{

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	
	 driver.findElement(By.xpath("//a[text()='Create New Account']" )) .click();
	 WebElement ele1=driver.findElement(By.id("day"));
	 Select daydd = new Select (ele1);
	 List<WebElement> alloptions=daydd.getOptions();
	 System.out.println("Total elements in day Dropdown are :"+alloptions.size());
	 
	 for(WebElement i:alloptions)
	 {
		 System.out.println(i.getText());
		 if(i.getText().equals("26"))
		 {
			 i.click();
			 break;
		 }
	 }
	 
	 

}
}