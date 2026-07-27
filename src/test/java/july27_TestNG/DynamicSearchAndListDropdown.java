package july27_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class DynamicSearchAndListDropdown {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void dynamicSearchAndDropdown_Example_1() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("pen");
		
		List<WebElement> dynamicList = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		Thread.sleep(2000);
		int count = dynamicList.size();
		System.out.println(count);
		dynamicList.get(5).click();
	}
	

	@Test
	public void dynamicSearchAndDropdown_Example_2() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("pen");
		
		Thread.sleep(1000);
		List<WebElement> dynamicList = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		int count = dynamicList.size();
		System.out.println(count);
		
		for(int i=0; i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			
			if(dynamicList.get(i).getText().contains("drive 128")) 
			{
				dynamicList.get(i).click();
				break;
			}
		}
	}
	
	
	
	@Test
	public void dynamicSearchAndDropdown_Example_3() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("pen");
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> dynamicList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='s-heavy']")));
		
		int count = dynamicList.size();
		System.out.println(count);
		
		for(WebElement element:dynamicList) 
		{
			System.out.println(element.getText());
			if(element.getText().contains("drive 128"))
			{
				element.click();
				break;
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
