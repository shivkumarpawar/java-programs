//This is the program for the binary search..
package com.algorithms;
import java.util.*;
import java.util.Arrays;
public class BinarySearch {

	int arraySize;
	int searchingElement;
	int i;
	int mid;
	public static void main(String[] args) {
        
		
		BinarySearch l= new BinarySearch(); 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array and elements in an array");
		l.arraySize=sc.nextInt();
		
		int[] myArray=new int[l.arraySize];
		
		for(int i=0;i<l.arraySize;i++)
		{
			System.out.println("Enter the"+i+"th number in array that should be sorted");
			int inputNumber =sc.nextInt();
			myArray[i]=inputNumber;
		}
		System.out.println("Enter the Element that has to be searched");
		l.searchingElement=sc.nextInt();

		l.binarySearch(myArray,l.arraySize,l.searchingElement);

	}
	
	 //This is the method for searching element in the array which is sorted
	    void binarySearch(int[] myArray,int arraySize,int searchingElement )
	    {
	    	
	    	//if array is not sorted this method will sort the array
	    	
	    	Arrays.sort(myArray);
	    	int first=0;
	    	int last=myArray.length-1;
	    	 int mid = (first + last)/2;  
	    	   while( first <= last ){  
	    	      if ( myArray[mid] < searchingElement )
	    	      {  
	    	        first = mid + 1;     
	    	      }
	    	      else if ( myArray[mid] == searchingElement )
	    	      {  
	    	        System.out.println("Element is found at index: " + mid);  
	    	        break;  
	    	      }
	    	      else
	    	      {  
	    	         last = mid - 1;  
	    	      }  
	    	      mid = (first + last)/2;  
	    	   }  
	    	   if ( first > last ){  
	    	      System.out.println("Element is not found!");  
	    	   }  
	    	
	    }
	

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    // 
	    
	    //  Dear customer you have missed call from unknown number.
	    // Welcome bonus to your account register now for free.
	    // Congratulation dear win money 
	    // Good news your loan has been approved successfully.
	    // 
	    
	    //   join the google pay account now and win the 500 cash.
	    // Online transac
	    
	    tions are much more easier.
	    
	    
	    //The day when we met was awesome.
	    //There are number of compamies in khaeadi byoass.
	    
	    //Google is the leading company in the world.
	    
	    //React.js language is developed by google.
	    
	    //Nifty is increased 704%
	    
	    //Pranita's kitchen is a awesome instagram page.
	    
	    //System.out.println("Shiv is a good boy");
	    
	    //IT industry leader TCS has rolled out salary hgikjes.
	    
	    //Mrizapur season 2 hit at amazon prime video.
	    
	    //The Maharashtra Government on friday announced rhat the school holidays have been exy=tended for 9 more days on the occasion of diwali.
	    
	    //As per metro officials there has been a lot of delaynon part iof pmc 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   
	    
	    

}
