package july12_TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
	
	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println(result.getName() + " " + "Successfull Executed...");
	}
	
	
	
	public void onTestFailure(ITestResult result) 
	{
		System.out.println(result.getName() + " " + "Got failed & Screenshot captured...");
	}
	
	
	
	public void onTestStart(ITestContext context) 
	{
		System.out.println(context.getName() + " " + "Test Case Started...");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
