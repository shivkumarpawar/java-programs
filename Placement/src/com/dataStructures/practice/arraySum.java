package com.practice;
import java.util.*;
public class arraySum {
	
	
	int Sum;
	

	public static void main(String[] args) 
	{
		arraySum a=new arraySum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] myArray=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the"+i+"th number in array");
			int inputNumber =sc.nextInt();
			myArray[i]=inputNumber;
		}
		System.out.println("Numbers in array are as follows");
		for(int i=0;i<size;i++)
		{
			System.out.println(myArray[i]);
		}
		
		a.Sum=a.sumOfArray(myArray);
		System.out.println("Sum of array is:"+a.Sum);
		
		
	}
	
	int sumOfArray(int myArray[])
	{
		int sum=0;
		
		
		for(int i=0;i<myArray.length;i++)
		{
			sum=sum+myArray[i];
		}
		
		return sum;
		
	}

}
