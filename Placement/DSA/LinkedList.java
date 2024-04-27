  import java.util.Scanner;
  public class LinkedList
{
	Node head=null;
	int inputValue;
	int nodes;
	Node temp;
	
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.println("how many nodes you want");
		l.nodes=sc.nextInt();
		for(int i=1;i<=l.nodes;i++)
		{
			System.out.println("Enter the"+ i + " value");
			l.inputValue=sc.nextInt();
			l.createNode(l.inputValue,l.head);
		}
		l.temp=l.head;
		while(l.temp.next!=null)
		{
			System.out.println(l.temp.data);
			l.temp=l.temp.next;
		}
		
	}
	Node createNode(int inputValue,Node head)
	{
		Node newNode=new Node();
		newNode.data=inputValue;
		newNode.next=null;
		
		if(head==null)
		{
			head=newNode;
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
			traverse.next=newNode;
			return head;
		}
	}
	
}