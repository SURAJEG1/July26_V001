package july19_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class hyperLink extends BaseClass{

	@Test
	public void getHyperLinkCountAndPrint() 
	{
		driver.get(baseUrl);
		List<WebElement> hyperLink = driver.findElements(By.tagName("a"));
		int count = hyperLink.size();
		System.out.println(count);

		for(WebElement element :  hyperLink) 
		{
			System.out.println(element.getText());
		}
	}












}
