package july09_TestNG;

import org.testng.annotations.Test;

public class SwapingTwoNumbers {
	
	
	
	
	@Test
	public void  beforeSwaping() 
	{
		int a = 10;
		int b = 20;
		System.out.println("Before swaping values are: " +a+" "+b);
	}
	
	@Test
	public void afterSwaping_Login_1() 
	{
		int a = 10;
		int b = 20;
		// logic-1 third variable
		int t = a;
		a = b;
		b = t;
		
		System.out.println("After swaping values are: " +a+" "+b);
	}
	
	
	@Test
	public void afterSwapingLogin_2() 
	{
		int a = 10;
		int b = 20;
		
		// logic-2 User operates(+ & -) without using third variable;
		a = a+b; //10+20 = 30;
		b = a-b; //30-20 = 10;
		a = a-b; //30-10 = 20;
		
		System.out.println("After swaping values are: " +a+" "+b);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
