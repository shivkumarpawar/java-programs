package com.algorithms;
import java.util.*;
public class LinearSearch {

	int arraySize;
	int searchingElement;
	int i;
	public static void main(String[] args) {
        
		// Algorithm
        // take inpput as array
		//there should be the key value that has to be searched
		// iterate left to right and search element
		// if found search successfull if not then unsuccesseful
		LinearSearch l= new LinearSearch(); 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array and elements in an array");
		l.arraySize=sc.nextInt();
		
		int[] myArray=new int[l.arraySize];
		
		for(int i=0;i<l.arraySize;i++)
		{
			System.out.println("Enter the"+i+"th number in array");
			int inputNumber =sc.nextInt();
			myArray[i]=inputNumber;
		}
		System.out.println("Enter the Element that has to be searched");
		l.searchingElement=sc.nextInt();

		l.linearSearch(myArray,l.arraySize,l.searchingElement);

	}
	 
	    void linearSearch(int[] myArray,int arraySize,int searchingElement )
	    {
	    	for(i=0;i<arraySize;i++)
	    	{
	    		if(myArray[i]==searchingElement)
	    		{
	    		System.out.println("Element found at "+i+1+" th index");
	    		break;
	    		}
	    		
	    	}
	    	if(i==arraySize)
	    		System.out.println("not found");
	    	
	    }
	

}
