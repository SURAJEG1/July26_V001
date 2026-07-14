package july12_TestNG;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataDrivenWithDataProvider {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(dataProvider = "searchProd")
	public void searchProduct(String prod) 
	{
		WebElement searchBox = driver.findElement(By.id(""));
		searchBox.sendKeys(prod);
		searchBox.click();
	}
	
	
	@DataProvider(name = "searchProd")
	public Object[][] dataDriven()
	{
		Object[][] data = new Object[2][1];
		data[0][0] = "computer table";
		data[1][0] = "workstation";
		
		return data;
	}
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
