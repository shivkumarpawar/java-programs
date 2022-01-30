package com.practice;
import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char arrayOfString[] = str.toCharArray();
		  
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				
				if(arrayOfString[i]==arrayOfString[j])
				{
					System.out.println(arrayOfString[j] + "");
					break;
				}
			}
		}
		
		
		
	}

}
