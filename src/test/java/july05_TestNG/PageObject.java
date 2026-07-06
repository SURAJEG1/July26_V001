package july05_TestNG;

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
	
	
	
	@FindBy (id = "") List<WebElement> id;
	@FindBy (name = "") WebElement name;
	
	
	
	public void nameOfUser() 
	{
		name.sendKeys("ram");
	}
	
	
	
	
	
	
	
	
	
	
	

}
