
public class Pattern3 {

	public static void main(String[] args) {
		  int k=0;
		 
		for(int i=1;i<=7;i++)
		{
		   for(int j=1;j<=7;j++)
			{
			   if(j==1 || j==7 || i==1 || i==7 	)
			    {
				  // if(i>=1 && i<=7)
				System.out.print("*");
				k--;
				}
				else
				{
					System.out.print(" ");
			    }
			}
			System.out.println();
			
		}

	}

}
/* The output of the above code
*******
*     *
*     *
*     *
*     *
*     *
*******

*/