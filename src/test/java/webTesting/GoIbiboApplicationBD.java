package webTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoIbiboApplicationBD {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/flights/");
		
		driver.findElement(By.xpath("//span[//p[@class= 'sc-bBHHxi jaZCwD']")).sendKeys("pune");
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//p[@class='sc-dPiLbb kUaZDb']//span[@class='autoCompleteTitle']"));
        System.out.println("Total Elements in list is : "+list.size());
      
        for(WebElement i:list)
        { 
        	String text=i.getText();
        	System.out.println(i.getText());
        	  if(text.contains("Pune, India"))
        	  {
        		  	i.click();
        		  	System.out.println("Match Found");
        		  	//break;
        	  }
       
       driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click(); 
       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("d");
      //Thread.sleep(2000);
       List<WebElement> list2= driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//p[@class='sc-dPiLbb kUaZDb']//span[@class='autoCompleteTitle']"));
       System.out.println("Total Elements in list are :"+list2.size());
        	  
        }
	}

}
