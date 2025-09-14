package JavaPractice;

import java.util.Scanner;

public class DataType_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
      int num=123,sum=0;
      while(num>0)
      {
    	  int last=num%10;
    	  sum=sum + last;
    	  num=num/10;
      }
      System.out.println("Sum of digit=" + sum);
        
     
	}

}
