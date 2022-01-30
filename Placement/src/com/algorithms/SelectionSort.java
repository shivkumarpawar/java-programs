/*
 * This is the program for the Selection sort
 * @author shiv kumar
 */
package com.algorithms;
import java.util.*;

public class SelectionSort {

	
	int arraySize;

	int i;

	public static void main(String[] args) {
        
		
		SelectionSort l= new SelectionSort(); 
		
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
		l.selectionSort( myArray);
		
	}
	
	//implementation of selection sort function 
     	void selectionSort(int[] myArray)
     	{
     		for(int i=0;i<myArray.length-1;i++)
    		{
    			int key=i;
    		    for (int j = i + 1; j < myArray.length; j++)
    		    {  
                    if (myArray[j] < myArray[key])    //check whether any element is smaller than the key element
                     key = j;
                      
    		    }
    		    //Swapping of elements after checkng the elements
    		    int smallerNumber = myArray[key];   
    		    myArray[key] = myArray[i];  
    		    myArray[i] = smallerNumber;  
		
	        }
     		
     		System.out.println("the array after selection sort");
     		for(int i=0;i<myArray.length;i++)
    		{
    			System.out.println(myArray[i]);
    		
    		}
	
	    }
}
