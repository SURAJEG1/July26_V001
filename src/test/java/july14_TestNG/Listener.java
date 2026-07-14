package july14_TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
	
	public void onTestStart(ITestContext context) 
	{
		System.out.println(context.getName() + " " + "Test Case Start...");
	}
	
	
	public void onTestSuceess(ITestResult result) 
	{
		System.out.println(result.getName() + " " + "Successfully Execute...");
	}
	
	
	public void onTestFailure(ITestResult result) 
	{
		System.out.println(result.getThrowable());
		System.out.println(result.getName() + " " + "Got failed & Screenshot captured...");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
