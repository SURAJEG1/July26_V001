package july12_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

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
	
	
	public void windowsHandles() 
	{
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parents = it.next();
		String child = it.next();
		
		driver.switchTo().window(parents);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
	}
	
	
	public void pageScrollDown() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
