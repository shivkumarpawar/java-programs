package com.dataStructures;
import java.util.Scanner;
public class BaapOfLinkList {
		
		int totalNumberOfNode;
		int inputValue;
		Node head=null;
		//Node temp;
		int value;
		
		public static void main(String[] args) 
		{
			
			BaapOfLinkList l=new BaapOfLinkList();
			Scanner sc=new Scanner(System.in);
			System.out.println("How many nodes you want to create");
			l.totalNumberOfNode=sc.nextInt();
			
			for(int i=0;i<l.totalNumberOfNode;i++)
			
			{
				System.out.println("Enter your "+ " "+i + " " +"value");
				l.inputValue=sc.nextInt();
				l.head=l.createNewNode(l.inputValue,l.head);
			
				
			}
			
			while(true)
			{
			System.out.println("Use following operations");
			System.out.println("1.front");
			System.out.println("2.end");
			System.out.println("3.middle");
			System.out.println("4.print list");
			System.out.println("5.reverseList");
			System.out.println("6.printAddressOfLinkList");
			System.out.println("7.print list");
			
			
			l.value=sc.nextInt();
			switch(l.value)
			{
			case 1:System.out.println("Adding node in front");
			System.out.println("enter the value");
			l.head=l.addNodeInFront(sc.nextInt(), l.head);
			break;
			
			
			case 2: System.out.println("adding node at the end");
			System.out.println("enter your number");
			l.head=l.createNewNode(sc.nextInt(), l.head);
			break;
			
			
			case 3: System.out.println("adding node in middle");
			System.out.println("enter your value");
			l.inputValue=sc.nextInt();
			l.head=l.addValueMiddle(l.inputValue, l.head);
			break;
			
			case 4: System.out.println("Printing the linked list");
			     l.printList(l.head);
			break;
			
			case 6:System.out.println("Deleting node");
			System.out.println("enter the value");
			l.head=l.deleteNode(sc.nextInt(), l.head);
			break;
			
			case 5: System.out.println("Reversing The linked list");
		     l.reverseList(l.head);
		    break;
		    
			case 7: System.out.println("This method is pending");
		     l.printAddressOfLinkList(l.head);
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
	
		
		//The method for printing linkedlist
		
		
		void printList(Node head)
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		 void printAddressOfLinkList(Node head)
		 {

				Node temp=head;
				while(temp!=null)
				{
					System.out.println(temp);
					temp=temp.next;
				}
		 }
		
		// The method for creating the newNode and the list also
		Node createNewNode(int value,Node head)
		{
			Node newNode=new Node();
			newNode.data=value;
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

		//The method for adding new node at first
		Node addNodeInFront(int newValue,Node head)
		{
			Node newNode=new Node();
			newNode.data=newValue;
			newNode.next=head;
			head=newNode;
			return head;
		}
		
   //
		 Node addValueMiddle(int value,Node head)
		 {
			 Node temp=null;
			 Node p;
			 Node q;
			 p=q=head;
			 Node newNode=new Node();
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
			 System.out.println("The New list after adding the middle value");
			
			 return head;
		 }
		 
		 Node deleteNode(int data, Node head)
			{
				Node t;
				t=head;
				while(t.next.data!=data)
				{
					t=t.next;
				}
				t.next=t.next.next;
				
				return head;
			}
		 
		 
		 //method for reversing the linked list
		 
		 Node reverseList(Node head)
		 { 
			 Node t1,t2;
			 t1=t2=null;
			 
			         while (head != null)
			        { 
			        	 t2=head.next;
			        	head.next=t1;
			        	t1=head;
			        	head=t2;
			        } 
			       
			        return t1; 
			    } 
		 }
		 
	
		

	


