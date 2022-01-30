 import java.util.*;
public class Cast
{ 

	public static void main(String[] args) 
	{ 
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the character");
		char i=in.next().charAt(0);

		
		int a = i+3; 
		char c=(char)a;
		int z =(int)c;
		
		System.out.println("The ASCII value of " + i + " is= " +a); 
		
		System.out.println("The ASCII value of  is= " + c); 
		
		System.out.println("The ASCII value of  is= " + z); 
	
		
	} 
} 
/*
 * Enter the character
 a
The ASCII value of a is= 100
The ASCII value of  is= d
The ASCII value of  is= 100
 * 
 * 
 * 
 */
