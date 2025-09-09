package TestNg;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Practice_One {

	@Test(groups= {"Smoke"})
     public void Demo()
     {
    	 System.out.println("Hello World");
    	 Assert.assertTrue(false);
     }
	  @AfterSuite
	public void BFSuite()
	{
		System.out.println("I am last one");
	}
	  @Test(groups= {"Smoke"})
	 public void SecondDemo()
	 {
		 System.out.println("Hammad Ashfaq");
	 }

}
