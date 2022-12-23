package webTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenricCodeForOrengeHRM {

	
		
		public static void bootstrapDropDown(WebDriver driver, String value)
		{
			List<WebElement>dd=driver.findElements(By.xpath(("//div[@role='listbox']//div//span")));
			System.out.println("Total Options :"+dd.size());
			for(WebElement i :dd)
			{
				String text=i.getText();
				System.out.println(text);
				if(text.contains(value))
				{ 
					i.click();
					break;
				}
 			}
		}
					 
	

			public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			    driver.get("https://opensource-demo.orangehrmlive.com/");
			    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				//Employee status
				driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
				bootstrapDropDown(driver,"Full-Time Probation") ;
				
				//Include
				driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
				bootstrapDropDown(driver,"Current and Past Employees");
				
				//Job Title
				driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]")).click();
				bootstrapDropDown(driver,"Account Assistant");
				
				//Sub unit
				driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[4]")).click();
				bootstrapDropDown(driver,"OrangeHRM");
		}
}




