package com.dataStructures;
import java.util.*;
public class createArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the"+i+"th number in array");
			int inputNumber =sc.nextInt();
			a[i]=inputNumber;
		}
		System.out.println("Numbers in array are as follows");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
