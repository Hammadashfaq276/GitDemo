package JavaPractice;

import java.util.Scanner;

public class DataType_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
       int [] arr = {1,2,4,5,6};
       int n=6;
       int total = n* (n + 1)/2;
       int sum=0;
       for(int i=0;i<arr.length;i++)
       {
    	   sum = sum + arr[i];
       }
       System.out.println(total-sum);
        
     
	}

}
