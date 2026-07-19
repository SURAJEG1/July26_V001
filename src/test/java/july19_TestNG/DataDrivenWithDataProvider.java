package july19_TestNG;

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
	
	
	@Test(dataProvider = "credential")
	public void doLogin(String un, String pwd) 
	{
		WebElement txtUsername = driver.findElement(By.id(""));
		WebElement txtPassword = driver.findElement(By.id(""));
		WebElement btnLogin = driver.findElement(By.id(""));
		
		txtUsername.sendKeys(un);
		txtPassword.sendKeys(pwd);
		btnLogin.click();
	}
	
	
	
	@DataProvider(name = "credential")
	public Object[][] dataDriver()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		data[1][0] = "admin";
		data[1][1] = "admin123";
		
		return data;
	}
	
	
	
	@AfterMethod
	public void TearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
