package JavaPractice;

import java.util.Scanner;

public class DataType_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
    int [] array = {1, 2, 3, 2, 4, 1, 5, 3, 6};
    for(int i=0;i<array.length;i++)
    {
    	System.out.println("Original Array=" + array[i]);
    }
   
    for(int i=0;i<array.length;i++)
    {
    	boolean IsUnique=true;
    	for(int j=0;j<i;j++)
    	{
    		if(array[i]==array[j])
    		{
    			IsUnique=false;
    			break;
    		}
    	}
    	if(IsUnique==true)
    	{
    		System.out.println("Unique Element" + array[i]);
    	}
    	
    }
        
     
	}

}
