package webTesting;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowserTesting {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		//Capabilities ()Browser Properties
		
		ChromeDriver driver = new ChromeDriver();
		Capabilities cap=driver.getCapabilities();
		System.out.println("Browser Name :"+cap.getBrowserName());
		System.out.println("Browser Name :"+cap.getBrowserVersion());
		System.out.println("Browser Platform :"+cap.getPlatformName() );

		//All Properties
		Map<String,Object>map=cap.asMap();
		System.out.println(map);
	}

}
    