import java.util.Scanner;
public class LeapYear {
     int year;
	
	
	public static void main(String[] args) {
		LeapYear l=new LeapYear();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to check");
		l.year= sc.nextInt();
	//	l.isLeap(l.year);
	    
	    }
	  void isLeap(int year)
	  {
		  if(year%4 ==0)
	        {
	            if( year % 100 == 0)
	            {
	                if ( year % 400 == 0)
	                    System.out.println(year + " is a leap year");
	                else
	                    System.out.println(year + " is not a leap year.");
	            }
	            else
	                System.out.println(year + " is a leap year.");
	        }
	        else
	            System.out.println(year +" is not a leap year.");
	        
	  }
	

	}




