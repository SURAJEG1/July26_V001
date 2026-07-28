package july28_TestNG;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	
	
	WebDriver driver;
	public ReusableMethods(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	
	public void maximized() 
	{
		driver.manage().window().maximize();
	}
	
	
	public void implicitlyWait(int wait) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
	}
	
	public void pageScrollDown() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,Document.body.scrollHeight)");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
