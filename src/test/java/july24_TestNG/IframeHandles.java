package july24_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class IframeHandles {
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void iframe() 
	{
		driver.switchTo().frame("");
		System.out.println("switched to ifame...");
		
		WebElement textPhoneNo = driver.findElement(By.xpath(""));
		textPhoneNo.sendKeys("432094209");
		
		driver.switchTo().defaultContent();
		System.out.println("switched back to default content");	
	}
	
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
