// This program is for the finding duplicates from the array and printing them written by shiv kumar
 
package com.practice;
import java.util.Scanner;
public class ArrayFindDuplicates {
	int inputValue;
	int count;
	
	public static void main(String[] args) {
		ArrayFindDuplicates a=new ArrayFindDuplicates();
		Scanner sc= new Scanner(System.in);
	      System.out.println("Enter the size of array");
	      int sizeOfArray=sc.nextInt();
		 int[] myArray= new int[sizeOfArray];
		 
		 for(int i=0;i<sizeOfArray;i++)
		 {
			 System.out.println("Enter the" +i+"value in the array");
			 a.inputValue=sc.nextInt();
			 myArray[i]=a.inputValue;
		 }
		 
		 System.out.println("Printing the values in array");
		 
		 for(int i=0;i<sizeOfArray;i++)
		 {
		     System.out.println(myArray[i]); 
		 }
		   a.findDuplicates(myArray);

	}
	
	  void findDuplicates(int[] myArray)
	 {
		  
		  for(int i=0;i<myArray.length;i++)
		  {
			  for(int j=i+1;j<myArray.length;j++)  
			  {
			  if(myArray[i]==myArray[j])
			  {
				  
				  System.out.println("The duplicating number is"+myArray[i]);
			  }
		   }
			  
		  }
		  

	 }
	  
	  

	 

}


