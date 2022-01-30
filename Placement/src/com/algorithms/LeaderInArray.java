/*This is the program in which we have to find the leader in the array that menas the 
on the right side of any element all the elements should be the less than that of the element 
then the that element is considered as the leader elemnets
 @author shiv kumar*/

package com.algorithms;
import java.util.*;

public class LeaderInArray {
	int arraySize;
	int j;
	public static void main(String[] args) {
		
		LeaderInArray l=new LeaderInArray();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size and elemnts in an array");
		l.arraySize=sc.nextInt();
		
         int[] myArray=new int[l.arraySize];
		
		for(int i=0;i<l.arraySize;i++)
		{
			System.out.println("Enter the"+i+"th number in array ");
			int inputNumber =sc.nextInt();
			myArray[i]=inputNumber;
		}
		 l.printLeaders(myArray,l.arraySize);
		

	}
	// this method is implememted to print the leaderrs in the array.
	void printLeaders(int[] myArray,int arraySize)
	{
		
		for(int i=0;i<arraySize;i++)
		{
			for(j=i+1;i<arraySize;j++)
			{
				if(myArray[j]>=myArray[i])
					break;
			}
			if(j == arraySize)
				System.out.println(myArray[i]);
		}
	}
}
