package july02_TestNG;

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
		WebElement textUsername = driver.findElement(By.className(""));
		WebElement textPassword = driver.findElement(By.id(""));
		WebElement clickOnLoginBtn = driver.findElement(By.id(""));
		
		textUsername.sendKeys(un);
		textPassword.sendKeys(pwd);
		clickOnLoginBtn.click();
	}
	
	
	
	@DataProvider(name = "credential")
	public Object[][] dataDriven()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "";
		data[0][1] = "";
		
		data[1][0] = "";
		data[1][1] = "";
		
		return data;
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
