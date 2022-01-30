/* this is the program in which we have to print the number which is 
 * majoraly occurs more than n/2
 * 
   @author shiv kumar
 
 */

package com.algorithms;
import java.util.*;

public class FindMissingNumber {
	int arraySize;
	int j;
	int count;
	public static void main(String[] args) {
		
		FindMissingNumber m=new FindMissingNumber();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size and elemnts in an array");
		m.arraySize=sc.nextInt();
		
         int[] myArray=new int[m.arraySize];
		
		for(int i=0;i<m.arraySize;i++)
		{
			System.out.println("Enter the"+i+1+"th number in array ");
			int inputNumber =sc.nextInt();
			myArray[i]=inputNumber;
		}
		 int missingNumber=m.getMissingNumber(myArray,m.arraySize);
		 System.out.println("The missing number is  "+missingNumber);
		

	}
	//function to print and find the majority element
	int getMissingNumber(int[] myArray,int n)
	{
		int total=0;
		total=(n+1)*(n+2)/2;   //we have the formula to find the sum of n natural numbers is n*(n+1)/2 then by substracting every element
		                          //we can find that missing number.
		for(int i=0;i<n;i++)  //here n is the array size where we have taken the n+1 for missing number will be added
		{
			total=total-myArray[i];
			
		}
		return total;
		
	}
}
