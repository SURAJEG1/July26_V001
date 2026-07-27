package july25_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class DataDrivernWithDataProviderAnnotation {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(dataProvider = "credentials")
	public void doLogin(String un, String pwd) 
	{
		WebElement textUsername = driver.findElement(By.id(""));
		WebElement textPassword = driver.findElement(By.xpath(""));
		WebElement btnLogin = driver.findElement(By.cssSelector(""));
		
		textUsername.sendKeys(un);
		textPassword.sendKeys(pwd);
		btnLogin.click();
	}
	
	
	@DataProvider(name = "credentials")
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
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

}
