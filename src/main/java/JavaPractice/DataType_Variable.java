package JavaPractice;

import java.util.Scanner;

public class DataType_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
      int a=0,b=1,c;
      int n=10;
      System.out.print(a + " " +  b);
      for(int i=2;i<=n;i++)
      {
    	  c=a+b;
    	  a=b;
    	  b=c;
    	  System.out.print(" "+ c);
      }
        
     
	}

}
