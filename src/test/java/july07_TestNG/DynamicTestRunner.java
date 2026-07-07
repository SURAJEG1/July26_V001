package july07_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicTestRunner{
	
	PageObject pageobject;
	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	@Test(priority = 1)
	public void searchProd() throws InterruptedException
	{
		pageobject = new PageObject(driver);
		pageobject.testSearchProduct("pen");
		pageobject.clickOnDynamicSearchDropdownList();
	}
	
	
	@Test(priority = 2)
	public void dynamicSearchAndListDropdown() throws InterruptedException 
	{
		pageobject = new PageObject(driver);
		pageobject.testSearchProduct("pen");
		pageobject.clickOnDynamicSearchDropdownListExample2();
		
	}
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void close() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
