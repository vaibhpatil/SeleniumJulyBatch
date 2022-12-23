package webTesting;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//Parent Window
		 String ParentId=driver.getWindowHandle();
		 System.out.println(ParentId);
		
		//OrengeHRM Link
		 driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	   
	   //Child Window
		 Set<String>allwindows=driver.getWindowHandles();
		 System.out.println(allwindows);
		 
		 for(String ChildId:allwindows)
		 {
			 if(!ParentId.equals(ChildId))
			 {
				driver.switchTo().window(ChildId);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
				driver.findElement(By.xpath("//input[@id='myText']")).sendKeys("vaibhavpatil123@gmail.com");
				//driver.close();
				
			 }
		 }
		 driver.switchTo().window(ParentId);
		 driver.findElement(By.name("username")).sendKeys("Vaibhav");
		 driver.quit();
		 
		 
		 

	}

}
