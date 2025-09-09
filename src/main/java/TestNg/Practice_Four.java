package TestNg;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Practice_Four implements ITestListener  {

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("I am Executing the  pass code " + result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("I am Executing failed the  pass code " +result.getName());
	}

}
