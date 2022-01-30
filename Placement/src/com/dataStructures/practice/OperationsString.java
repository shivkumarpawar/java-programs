package com.practice;
import java.util.*;
public class OperationsString {
	String reverseString;
	public static void main(String[] args) {
		String strrr=null;
		if(strrr.length()==0)
		{
			System.out.println("1");
		}
		else
			if(strrr==null)
			System.out.println("2");
			else
				System.out.println("3");
		
		OperationsString s=new OperationsString();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String str=sc.nextLine();
		
		    s.reverseString(str);
		    s.findDuplicates(str);
		   // s.findsubString(str);
		
		

	}
	
	void reverseString(String str)
	{
		for(int i=str.length()-1;i>=0;i--)
		{
			reverseString=reverseString+str.charAt(i);
		}
		
		System.out.println("The reversed string is " +reverseString);
		
	}
	
	void findDuplicates(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();i++)
			{
				if(str.charAt(i)==str.charAt(j+1))
				{
				   System.out.println("the duplicates are"+str.charAt(i));
				   
				}
			}
		}
		
	}
	
	void findsubString(String str)
	{
		
	}
	

}
