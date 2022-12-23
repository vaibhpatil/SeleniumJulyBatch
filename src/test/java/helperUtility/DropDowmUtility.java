package helperUtility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDowmUtility {

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

	}

  