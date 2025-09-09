package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

@Test
public class Practice_Two {
  
	@BeforeClass
	public void BeforeLogin()
	{
		System.out.println("Executing the login test");
	}
	@Parameters({"URL","APIKEY/username"})
	@Test
	public void WebLoginCarLoan(String url,String key)
	{
		System.out.println("Web Login Home");
		System.out.println(url);
		System.out.println(key);
		
	}
	@AfterMethod
	public void Release()
	{
		System.out.println("I am executing before method test");
	}
	public void Build()
	{
		System.out.println("This is build test");
	}
	
	public void MobileSigout()
	{
	    System.out.println("Mobile SignOut");	
	}
	@Test(dataProvider="getData")
	public void MobileLoginCarLoan(String username,String password)
	{
		System.out.println("Mobile Login Home");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	public void MobileSignInCarLoan()
	{
		System.out.println("Mobile Sign In Home");
	}
	

	public void ApiLoginCarLoan()
	{
		System.out.println("Api Login Home");
	}
	@DataProvider
	public Object getData()
	{
		Object[][] data =new Object[3][2];
		data[0][0]="Ali";
		data[0][1]="Ali123";
		data[1][0]="Imran";
		data[1][1]="Imran123";
		data[2][0]="Malik";
		data[2][1]="Malik123";
		return data;
	}

}
