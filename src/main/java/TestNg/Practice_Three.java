package TestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice_Three {
	
	
 @BeforeTest
 public void Begin()
 {
	 System.out.println("Testing is Started");
 }
 @AfterSuite
 public void AFSuite()
 {
	 System.out.println("I am last one");
 }
   @Test
   public void Test()
   {
	   System.out.println("Hello World");
   }
   @AfterTest
   public void End()
   {
	   System.out.println("Testing is completed");
   }

}
