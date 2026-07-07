package july07_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {
	
	//crate object of WebDriver interface.
	WebDriver driver;
	
	//parameterize constructor
	public PageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy (id = "twotabsearchtextbox") WebElement searchBox;
	@FindBy (xpath = "//span[@class='s-heavy']") List<WebElement> dynamicList;
	
	
	
	
	public void testSearchProduct(String prod) 
	{
		searchBox.sendKeys(prod);
	}
	
	
	public void clickOnDynamicSearchDropdownList() throws InterruptedException 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfAllElements(dynamicList));
		System.out.println(dynamicList.size());
		
		for(WebElement element : dynamicList) 
		{
			System.out.println(element.getText());
			if(element.getText().contains("drive 128")) 
			{
				element.click();
				break;
			}
			Thread.sleep(2000);
		}
	}
	
	
	
	
	public void clickOnDynamicSearchDropdownListExample2() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfAllElements(dynamicList));
		System.out.println(dynamicList.size());
		dynamicList.get(5).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
