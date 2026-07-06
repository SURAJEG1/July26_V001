package july06_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Iframe {
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void iframHandles() 
	{
		driver.switchTo().frame("auth-login-ui");
		System.out.println("Switched to ifame...");
		
		WebElement textPhoneNo = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		textPhoneNo.sendKeys("5757577575");
		
		WebElement clickOnOTP = driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-3 bTZuzF']"));
		clickOnOTP.click();
		
		driver.switchTo().defaultContent();
		System.out.println("Switched to default content...");
	}
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	

}
