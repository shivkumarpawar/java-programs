/* this is the program in which we have to print the number which is 
 * majoraly occurs more than n/2
 * 
   @author shiv kumar
 
 */

package com.algorithms;
import java.util.*;

public class MajorityElement {
	int arraySize;
	int j;
	int count;
	public static void main(String[] args) {
		
		MajorityElement m=new MajorityElement();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size and elemnts in an array");
		m.arraySize=sc.nextInt();
		
         int[] myArray=new int[m.arraySize];
		
		for(int i=0;i<m.arraySize;i++)
		{
			System.out.println("Enter the"+i+"th number in array ");
			int inputNumber =sc.nextInt();
			myArray[i]=inputNumber;
		}
		 m.findMajorityElement(myArray,m.arraySize);
		

	}
	//function to print and find the majority element
	void findMajorityElement(int[] myArray,int arraySize)
	{
		
		for(int i=0;i<arraySize;i++)
		{
			for(j=i+1;i<arraySize;j++)
			{
				if(myArray[i]==myArray[j])
					count++;
			}
			if(count>arraySize/2)
				System.out.println(myArray[i]);
		}
	}
}
