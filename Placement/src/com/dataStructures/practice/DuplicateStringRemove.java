package com.practice;
import java.util.*;

public class DuplicateStringRemove {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string ");
		String input = sc.nextLine();
		
	
		
		String output= new String();
		
		for(int i=0;i<input.length();i++)
		{
			for(int j=0;j<input.length();j++)
			{
				if(input.charAt(i)!=output.charAt(j))
				{
					output=output+input.charAt(i);
				}
			}
		}
		System.out.println("The string after removing the duplicates"  +output);

	}

}
