package july13_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class Iframe {
	
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test
	public void iframeHandle() 
	{
		driver.switchTo().frame("");
		System.out.println("switched to iframe...");
		
		WebElement textPhoneNo = driver.findElement(By.xpath(""));
		WebElement BtnOTP  = driver.findElement(By.xpath(""));
		
		textPhoneNo.sendKeys("");
		BtnOTP.click();
		
		driver.switchTo().defaultContent();
		System.out.println("switched to default...");
		
	}
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
