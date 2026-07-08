package july08_TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
	
	
	
	public void onTestStart(ITestContext constext) 
	{
		System.out.println(constext.getName() + " " + "Test Case Started...");
	}
	
	
	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println(result.getName() + " " + "Successfully executed...");
	}
	
	
	
	public void onTestFailure(ITestResult result) 
	{
		System.out.println(result.getName() + " " + "Got failed & Screenshot captured...");
		System.out.println(result.getThrowable());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
