/*
 * This is the program for the Bubble sort
 * @author shiv kumar
 */
package com.algorithms;
import java.util.*;

public class BubbleSort {

	
	int arraySize;

	int i;

	public static void main(String[] args) {
        
		
		BubbleSort l= new BubbleSort(); 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array and elements in an array");
		l.arraySize=sc.nextInt();
		
		int[] myArray=new int[l.arraySize];
		
		for(int i=0;i<l.arraySize;i++)
		{
			System.out.println("Enter the"+i+"th number in array ");
			int inputNumber =sc.nextInt();
			myArray[i]=inputNumber;
		}
		l.bubbleSort( myArray);
		
	}
	
	//implementation of bubble sort function 
	 void bubbleSort(int myArray[])
	    {
	        int n = myArray.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (myArray[j] > myArray[j+1])
	                {
	                   
	                    int temp = myArray[j];
	                    myArray[j] = myArray[j+1];
	                    myArray[j+1] = temp;
	                }
	    
	 
     		System.out.println("the array after bubble sort");
     		for(int i=0;i<myArray.length;i++)
    		{
    			System.out.println(myArray[i]);
    		
    		}
	
	    }
}
