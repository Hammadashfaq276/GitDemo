package TestNg;

import org.testng.annotations.Test;

public class PS1 extends PS {
   
	@Test
	public void TestRun()
	{
	
		PS2 ps2=new PS2(3);
		int a=3;
		DoThis();
		System.out.println(ps2.Increment());
		System.out.println(ps2.Decrement());
		System.out.println(ps2.multiplyThree());
		
		
		
	}
	
}
