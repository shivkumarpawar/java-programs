
import java.util.Scanner;


 class AdeshLinllist
{
	int totalNoofNode;
	int inputvalue;
	Node head=null;
	Node Newnode;
	Node temp;
	
	public static void main(String args[])
	{   AdeshLinllist l = new AdeshLinllist();
		System.out.println("Enter how many no of nodes you want to create :");
		Scanner sc = new Scanner(System.in);
		l.totalNoofNode=sc.nextInt();
		 
		 for(int i=0;i<l.totalNoofNode;i++)
		 { System.out.println("Enter your"+i+"value");
	        l.inputvalue=sc.nextInt();
		
			l.head= l.createNewnode(l.inputvalue,l.head); 
		 }
		 l.temp=l.head;
		while(l.temp!=null)
		{
			System.out.println(l.temp.data);
			l.temp=l.temp.next;
		}			
		
		
	}
	 Node createNewnode(int value, Node head)
		 {
             			 Node Newnode = new Node();
						 Newnode.data=value;
						 Newnode.next=head;
						 if(head==null)
						 {
							 head=Newnode;
							 return head;
                            
						 }
						 
						 else
						 {
							Node traverse;
                             traverse=head;
							 while(traverse.next!=null)
							 {
								 traverse=traverse.next;
							 }
							 traverse.next=Newnode;
							 return head;
							 
						 }
		 }
		 
}