package july14_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {
	
	//create object of WebDriver interface
	WebDriver driver;
	
	//parameterize constructor
	public PageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy (id = "") WebElement id;
	@FindBy (name = "") List<WebElement> name;		
	
	
	
	
	public void textUsername() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
