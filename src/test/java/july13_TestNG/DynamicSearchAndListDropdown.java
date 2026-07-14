package july13_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class DynamicSearchAndListDropdown {

	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void dynamicSearch_Example1() 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("laptop");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		List<WebElement> dynamicList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='s-heavy']")));
		int count = dynamicList.size();
		System.out.println(count);
		dynamicList.get(5).click();
	}
	
	
	
	@Test
	public void dynamicSearch_Example2() 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("laptop");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> dynamicList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='s-heavy']")));
		System.out.println(dynamicList.size());
		
		for(WebElement element : dynamicList) 
		{
			if(element.getText().contains("under 50k+")) 
			{
				System.out.println(element.getText());
				element.click();
				break;
			}
		}		
	}
	
	
	
	@Test
	public void dynamicSearch_Example3() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("laptop");
		
		Thread.sleep(2000);
		List<WebElement> dynamicList = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		System.out.println(dynamicList.size());
		
		for(int i=0; i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			if(dynamicList.get(i).getText().contains("under 50k+")) 
			{
				dynamicList.get(i).click();
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
