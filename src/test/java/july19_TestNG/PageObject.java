package july19_TestNG;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	
	
	WebDriver driver;
	public PageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (id = "") 
	WebElement id;
	
	@FindBy (name = "")
	List<WebElement> name;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
