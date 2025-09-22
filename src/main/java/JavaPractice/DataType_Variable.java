package JavaPractice;

import java.util.Scanner;

public class DataType_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
      int n=4;
      int max_width=2*n-1;
      for(int i=0;i<n;i++)
      {
    	  int stars=2*i+1;
    	  int spaces=(max_width-stars)/2;
    	  
    	  for(int j=0;j<spaces;j++)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int j=0;j<stars;j++)
    	  {
    		  System.out.print("*");
    	  }
    	
    	  System.out.println();
      }
        
     
	}

}
