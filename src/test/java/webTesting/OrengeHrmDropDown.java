package webTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrengeHrmDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//For Employee Info DD
		
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
		
		// For Capture List 
		List<WebElement>empdd=driver.findElements(By.xpath("//div[@role='listbox']//div//span"));
		
		System.out.println("Total Options"+empdd.size()); 
		for(WebElement i:empdd)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Full-Time Probation"))
			{
				i.click();
			   break;
		    }
		}

	}

} 
