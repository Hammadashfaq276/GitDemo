package JavaPractice;

import java.util.Scanner;

public class DataType_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
        int num=123;
        int temp=num;
        int rev=0;
        while(temp>0)
        {
        	int last=temp % 10;
        	rev=(rev*10)+last;
        	temp=temp/10;
        }
        
        if(num==rev)
        {
        	System.out.println(num + " Is Palindrome Number");
        }
        else
        {
        	System.out.println(num + " Is not Palindrome Number");
        }
        
        
     
	}

}
