package webTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusApplication {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Viman Nagar",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("New Delhi",Keys.ENTER);
		//for date
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		//month Selection
		String month="Nov";
		String year="2022";
		String date="26"; 
		
		
		
		while(true)
		{
			String text =driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			String mon=text.split(" ")[0];
			String yea=text.split(" ")[1];
			 
			//.out.println(mon+" : "+yea);
		
			if(mon.equals(month)&&yea.equals(year)) //this for current month
            {
            	break;
            }else
            	
            {
            	driver.findElement(By.xpath("//button[text()='>']")).click();
            }
            
		}
		
		
		  //selection for dates
		List<WebElement>alldates=driver.findElements(By.xpath("//table//tbody//tr//td"));
		System.out.println("Total Dates: "+alldates.size());
		for(WebElement i: alldates)
		{
			System.out.println(i.getText());
			if(i.getText().equals(date))
			{
				i.click();
				break;
			}
		}
	}

}
 