package com.dataStructures;
import java.util.Scanner;
public class DoubleLinklist {

	Dnode head;
	Dnode temp;
	int sizeOflinklist;
	int value;
	char ch;
	int inputValue;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DoubleLinklist l=new DoubleLinklist();
		System.out.println("enter the number of nodes you want");
		l.sizeOflinklist=sc.nextInt();
		
		for(int i=0;i<l.sizeOflinklist;i++)
		{
			System.out.println("enter your"+ " "+ i+ " "+ "value");
			l.value=sc.nextInt();
			l.head=l.createNode(l.value, l.head);
			
		}
		/*
		l.temp=l.head;
		while(l.temp!=null)
		{
			System.out.println(l.temp.data);
			l.temp=l.temp.next;
		}
		*/
		while(true)
		{
		System.out.println("Use following operations");
		System.out.println("1.front");
		System.out.println("2.end");
		System.out.println("3.middle");
		System.out.println("4.print list");
		System.out.println("5.reverse");
		l.value=sc.nextInt();
		
		switch(l.value)
		{
		case 1:System.out.println("Adding node in front");
		System.out.println("enter the value");
		l.head=l.addNodeInFront(sc.nextInt(), l.head);
		break;
		
		
		case 2: System.out.println("adding node at the end");
		System.out.println("enter your number");
		l.head=l.createNode(sc.nextInt(), l.head);
		break;
		
		
		case 3: System.out.println("adding node in middle");
		System.out.println("enter your value");
		l.inputValue=sc.nextInt();
		l.head=l.addNodeInMiddle(l.inputValue, l.head);
		break;
		
		case 4: System.out.println("Printing the Double linked list");
		     l.printList(l.head);
		break;
		
		case 5: System.out.println("Reversing the  linked list");
	     l.reverse(l.head);
	    break;
	
		
		default:
			
			System.out.println("Sorry invalid choice.");
		
		/*	l.ch=sc.nextLine().charAt(0);
			if(l.ch=='y' && l.ch=='Y')
			{
				continue;
			}
			else
			{
				System.out.println("Sorry you have entered incorrect character");
				break;
			}
			*/
		}
		}
		
	}
	 void printList(Dnode head)
	 {

			Dnode temp=head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
	 }
	Dnode createNode(int data, Dnode head)
	{
		Dnode newNode=new Dnode();
		newNode.prev=null;
		newNode.next=null;
		newNode.data=data;
		
		if(head==null)
		{
			head=newNode;
			
		}
		else
		{
			Dnode t;
			t=head;
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next=newNode;
			newNode.prev=t;
			
		}
		
		return head;
	}
	
	Dnode addNodeInFront(int data, Dnode head)
	{
		Dnode nn=new Dnode();
		nn.prev=null;
		nn.next=null;
		nn.data=data;
		nn.next=head;
		head.prev=nn;
		head=nn;
		return head;
	}

	
	Dnode addNodeInMiddle(int data, Dnode head)
	{
		 Dnode temp=null;
		 Dnode p;
		 Dnode q;
		 p=q=head;
		 Dnode newNode=new Dnode();
		 newNode.prev=null;
		  newNode.data=value;
		  newNode.next=null;
		  
		 // finding middle number
		 while(q!=null &&  q.next!=null)
			{
			  q=q.next.next;
			  p=p.next;
			}
		 System.out.println("The Middle of Linked list is\n"+p.data);
		 
		 temp=p.next;
		 p.next=newNode;
		 newNode.next=temp;
		 System.out.println("Enter printList option to print list");
		 
		
		return head;
	}
	
	 Dnode reverse(Dnode head) { 
		 Dnode prev = null; 
		 Dnode traverse = head; 
		 Dnode temp = null; 
	        while (traverse != null)
	        { 
	        	temp = traverse.next; 
	            traverse.next = prev; 
	            prev = traverse; 
	            traverse = temp; 
	        } 
	        head = prev; 
	        return head; 
	    } 
	  
}
