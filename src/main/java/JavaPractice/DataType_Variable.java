package JavaPractice;

import java.util.Scanner;

public class DataType_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
     int n=29;
     boolean Isprime=true;
     if(n<=1)
     {
    	 Isprime=false;
     }
     else if(n>2 && n%2==0)
     {
    	 Isprime=false;
     }
     else
     {
    	 for(int i=3;i*i<=n;i=i+2)
    	 {
    		 if(n%i==0)
    		 {
    			 Isprime=false;
    			 break;
    		 }
    	 }
     }
     if(Isprime==true)
     {
    	 System.out.println(n + " Is Prime Number");
     }
     else
     {
    	 System.out.println(n + " Is not Prime Number");
     }
     
        
     
	}

}
