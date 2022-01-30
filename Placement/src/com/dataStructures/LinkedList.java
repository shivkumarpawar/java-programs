package com.dataStructures;
import java.util.Scanner;
public class LinkedList {
		
		int totalNumberOfNode;
		int inputValue;
		Node head=null;
		Node temp;
		
		public static void main(String[] args) {
			
			LinkedList l=new LinkedList();
			Scanner sc=new Scanner(System.in);
			System.out.println("How many nodes you want to create");
			l.totalNumberOfNode=sc.nextInt();
			
			for(int i=0;i<l.totalNumberOfNode;i++)
			
			{
				System.out.println("Enter your "+ " "+i + " " +"value");
				l.inputValue=sc.nextInt();
				l.head=l.createNewNode(l.inputValue,l.head);
			
				
			}
			
			System.out.println("Enter the value For new Node");
			l.head=l.addNodeFirst(sc.nextInt(),l.head);
			
		l.temp=l.head;
			while(l.temp!=null)
			{
				System.out.println(l.temp.data);
				l.temp=l.temp.next;
			}
			l.findMiddle(l.head);

			System.out.println("Enter the value For new Node");
			l.head=l.addNodeAnyLoc(sc.nextInt(),l.head);
			
		
			
		}
		Node addNodeAnyLoc(int data,Node head)
		{
			Node traverse=head;
			Scanner sc=new Scanner(System.in);
			System.out.println("Add the new value after you want to add the new node");
			int value=sc.nextInt();
			while(traverse!=null && traverse.next!=null)
			{
			  if(traverse.data==value)
			  {
				 createNewNode(data,head);
				 break;
			  }
			  else
			  {
				  System.out.println("please Enter the correct value in linked list");
			  }
			}
			return head;
			
		}
		void findMiddle(Node head)
		{
			Node p;
			Node q;
			p=q=head;
			if(head!=null)
			{
			  while(q!=null && q.next!=null)
			  {
				q=q.next.next;
				p=p.next;
				
			}
			System.out.println("The middle of linked list is"+p.data);
			}
			
		}
		Node addNodeFirst(int newValue,Node head)
		{
			Node newNode=new Node();
			newNode.data=newValue;
			newNode.next=head;
			head=newNode;
			return head;
		}
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

	}



