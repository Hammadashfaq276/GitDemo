package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {
    
	public void DoThis()
	{
		System.out.println("I am Here");
	}
	@BeforeMethod
	public void BeforeRun()
	{
		System.out.println("Run me first");
	}
	@AfterMethod
	public void AfterRun()
	{
		System.out.println("Run me last");
	}
}
