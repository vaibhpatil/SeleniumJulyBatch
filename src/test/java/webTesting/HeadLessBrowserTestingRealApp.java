package webTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import helperUtility.DropDowmUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowserTestingRealApp {

	public static void main(String[] args) {
		
		//For Headless BrowserTesting
		
		ChromeOptions obj = new ChromeOptions();
		obj.setHeadless(true);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(obj);
		driver.get("https://www.amazon.in/");
		
		//address of Dropdown
		WebElement ele1 =driver.findElement(By.id("searchDropdownBox"));
		DropDowmUtility.selectbasedDropDown(ele1,"Prime Video" );

	}

}
