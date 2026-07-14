package july14_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class DataDrivenWithDataProvider {
	
	String Url = "";
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(dataProvider = "credential")
	public void login() 
	{
		WebElement textUsername = driver.findElement(By.id(""));
		WebElement textPassword = driver.findElement(By.id(""));
		WebElement btnLogin = driver.findElement(By.xpath(""));
	}
	
	
	
	
	@DataProvider(name = "credential")
	public Object[][] dataDriven()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "Admin";
		data[0][1] = "welcome1";
		
		data[1][0] = "admin";
		data[1][1] = "welcome1";
		
		return data;
	}
	
	
	
	
	
	
	
	
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
