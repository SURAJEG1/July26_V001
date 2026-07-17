package july15_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class HyperLinkCountAndPrint {
	
	
	WebDriver driver;
	@BeforeTest
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void hyperLink() 
	{
		List<WebElement> hyperLink = driver.findElements(By.tagName("a"));
		
		int count = hyperLink.size();
		System.out.println(count);
		for(WebElement element : hyperLink) 
		{
			System.out.println(element.getText());
		}
	}
	
	
	
	
	
	@AfterTest
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
