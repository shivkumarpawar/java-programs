//This is the program to find the facorial of nnumber that can be inputed from user

import java.util.Scanner;
public class Factorial {
 
   int fact=1,inputNumber;
   
	public static void main(String[] args)
	{
		
		Factorial f=new Factorial();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for facorial");
		f.inputNumber=sc.nextInt();
		
		f.fact(f.inputNumber);//the method for the factorial
	}
	
	void fact(int inputNumber)//the method implimentation
	{
		  for(int i=1;i<=inputNumber;i++)
		  {    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+inputNumber+"is"+fact); 
	}

}

