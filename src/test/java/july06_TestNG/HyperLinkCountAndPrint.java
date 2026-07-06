package july06_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class HyperLinkCountAndPrint {
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void getHyperLinkCountAndPrint() throws InterruptedException 
	{
		List<WebElement> hyperLinkList = driver.findElements(By.tagName("a"));
		int count = hyperLinkList.size();
		System.out.println(count);
		Thread.sleep(2000);
		for(WebElement element : hyperLinkList) 
		{
			System.out.println(element.getText());
		}
	}
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
