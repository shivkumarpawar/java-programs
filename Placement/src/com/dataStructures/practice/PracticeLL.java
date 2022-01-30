


//create the function of reverse and print it


package com.practice;
import java.util.*;
public class PracticeLL {
	
	int NoOfNodes;
	Node head=null;
	int inputValue;
	int sum;
	
	
	

	public static void main(String[] args) {
		
		PracticeLL l = new PracticeLL();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of nodes in the linked list");
		  l.NoOfNodes=sc.nextInt();
		  
		  for(int i=0;i<l.NoOfNodes;i++)
		  {
			  System.out.println("Enter the value for new Node");
			  l.inputValue=sc.nextInt();
		      l.head  =l.createNode(l.inputValue,l.head);
		  }
		  l.printList(l.head);
		  
		 l.sum= l.sum(l.head);
		 
		System.out.println("The sum of the linked list is :" +l.sum);
		

	}
	
	void printList(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	  
	
	Node createNode(int inputValue, Node head)
	{
		Node newNode=new Node();
		 
		newNode.data=inputValue;
		newNode.next=null;
		
		
		if(head == null)
		{
			head=newNode;
			
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
			 
		}
		 return head;
	}
	
	int sum(Node head)
	{
		int sum=0;
		Node t1;
		t1=head;
		while(t1!=null)
		{
			sum=sum+t1.data;
			t1=t1.next;
		}
		return sum;
	}

}
