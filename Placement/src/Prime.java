import java.util.*;
public class Prime {
     boolean isPrime(int number)
     { 
    	  int i;
 		  for(i=2;i<=number-1;i++)
 		     if(number%i==0)
 		    	break;
 		   if(number==i)
    	       return(true);
 		  else
 			  return(false);
 		  }
     
     
	public static void main(String[] args) {
		Prime p =new Prime();
		 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the number to check");
 		  int number=sc.nextInt();
		   System.out.println(p.isPrime(number));
		   int temp=0;
         for(int j=2;j<100;j++)
         {
		    for(int k=2;k<j;k++)
		    {
		    	if(j%k==0)
		    	{
		    		break;
		    	}
		    	if(j==k)
		    		System.out.println(j);
		    	
		    	}
		    }
		    
		    	
	}

}
