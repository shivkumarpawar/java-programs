
public class Pattern2 {

	public static void main(String[] args) {
		  int k=7;
		 
		for(int i=1;i<=7;i++)
		{
		  for(int j=1;j<=7;j++)
	       {
			 if(j<=7)
				{
					if(k==j)
					{
					System.out.print(" ?");
					k--;
			     	 }
					else
							if(i==j)
								System.out.print(" -");
							else
							System.out.print(" *");
							
				}
				else
				{
					
					System.out.print("  ");
				}
				
				
			}
			System.out.println();
			
		}

	}

}
/*  tjhe output the given program is
 
  - * * * * * ?
 * - * * * ? *
 * * - * ? * *
 * * * ? * * *
 * * ? * - * *
 * ? * * * - *
 ? * * * * * -
 
 
 
 
 
 */
