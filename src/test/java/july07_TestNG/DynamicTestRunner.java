package july07_TestNG;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicTestRunner extends BaseClass{
	
	
	
	@Test
	public void searchProd() throws InterruptedException
	{
		driver.get(baseUrl);
		PageObject pageobject = new PageObject(driver);
		pageobject.testSearchProduct("pen");
		pageobject.clickOnDynamicSearchDropdownList();
	}
	
	
	
	
	@Test
	public void dynamicSearchAndListDropdown() throws InterruptedException 
	{
		driver.get(baseUrl);
		PageObject pageobject = new PageObject(driver);
		pageobject.testSearchProduct("pen");
		pageobject.clickOnDynamicSearchDropdownListExample2();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
