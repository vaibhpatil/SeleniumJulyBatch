package webTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import helperUtility.DropDowmUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAutomation1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//address of drop down
			WebElement ele1 =driver.findElement(By.id("searchDropdownBox"));
			DropDowmUtility.selectbasedDropDown(ele1,"Prime Video" ); 
			
	/*		Select ddele= new Select(ele1);
			System.out.println("Drop down support multiple selection ?"+ddele.isMultiple());
			//for selecting single value
			ddele.selectByVisibleText("Baby");
			Thread.sleep(2000);
			ddele.selectByValue("search-alias=fashion");
			Thread.sleep(2000);
			ddele.selectByIndex(1);
			
	   //To Capture all values of drop-down
			List<WebElement> alloptions=ddele.getOptions();
			System.out.println("Total Options in Drop-Down are :"+alloptions.size());
		
		//iterate all options
			
			for(WebElement i : alloptions)
			{
				System.out.println(i.getText());
			}
			
			//for fetch the specific element
			
			for(WebElement i: alloptions)
			{
				if(i.getText().equals("Kindle Store"))
			
			{
					i.click();
					break;
			}
				
			}*/
			
			
			

	}

	private static void DropdownUtility(WebElement ele1, String string) {
		// TODO Auto-generated method stub
		
	}

}
