
public class Diamond {

	public static void main(String[] args) {
		  int k=0;
		 
		for(int i=1;i<=7;i++)
		{
		 //  i<=4 ? k++ : k--;
			
			if(i<=4)
				k++;
			
			else
				k--;
				
				for(int j=1;j<=7;j++)
			{
					 
				if(j>=(5-k) && j<=(3+k))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			}
		}
}
/* The output is
   *   
  ***  
 ***** 
*******
 ***** 
  ***  
   *   

*/