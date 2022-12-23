package webTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenricCodeSelectBasedDD {
	 
	public static  void selectbasedDropDown(WebElement ele1,String value)
	{
		Select dd =new Select(ele1);
		List<WebElement>alloptions=dd.getOptions();
		System.out.println("Total Elements in DropDown Are :"+alloptions.size());
		
		for(WebElement i:alloptions)
		{
			System.out.println(i.getText());
			if(i.getText().equals(value))
			{
				i.click();
				break;
			}
		}
	}
		public static void main(String[]args)
		{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com"); 
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		// day drop down
		WebElement daydd=driver.findElement(By.id("day"));
	    selectbasedDropDown(daydd,"26");
	    
	    // Month Drop Down
	    WebElement mondd=driver.findElement(By.id("month"));
	    selectbasedDropDown(mondd,"Nov");
	    
	    // Year Drop Down
	    WebElement yeadd=driver.findElement(By.id("year"));
	    selectbasedDropDown(yeadd,"2000");

	}
 
}
  