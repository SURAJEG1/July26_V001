package july15_TestNG;

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
	public void dynamicSearchAndDropdownExample1() 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("lap");

		List<WebElement> dynamicList = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		int count = dynamicList.size();
		System.out.println(count);

		for(int i=0; i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());

			if(dynamicList.get(i).getText().contains("top bags for men office use")) 
			{
				dynamicList.get(i).click();
				break;
			}
		}
	}


	@Test
	public void dynamicSearchAndDropdownExample2() 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("pen");

		//Apply Explicit Wait to locate Xpath of dynamic Element.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		List<WebElement> dynamicList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='s-heavy']")));
		int count = dynamicList.size();
		System.out.println(count);
	}



	@Test
	public void dynamicSearchAndDropdownExample3() 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("pen");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> dynamicList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='s-heavy']")));
		System.out.println(dynamicList.size());

		for(WebElement element : dynamicList) 
		{
			System.out.println(element.getText());
			if(element.getText().contains("cil pouch for girls aesthetic")) 
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
