package com.dataStructures;
import java.util.Scanner;
public class TestDoubleReverse {
	
	
	

		Dnode head;
		Dnode temp;
		int sizeOflinklist;
		int value;
		char ch;
		int inputValue;
		public static void main(String[] args)
		{
			
			Scanner sc=new Scanner(System.in);
			TestDoubleReverse l=new TestDoubleReverse();
			System.out.println("enter the number of nodes you want");
			l.sizeOflinklist=sc.nextInt();
			
			for(int i=0;i<l.sizeOflinklist;i++)
			{
				System.out.println("enter your"+ " "+ i+ " "+ "value");
				l.value=sc.nextInt();
				l.head=l.createNode(l.value, l.head);
				
			}
			
			l.printList(l.head);
			l.reverse(l.head);
			  System.out.println("After Reversing the list");
			  l.printList(l.head);
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
		
		
		 void reverse(Dnode head) 
		 { 
            Dnode temp = null; 
            Dnode current = head; 
            while (current != null) 
            { 
              temp = current.prev; 
              current.prev = current.next; 
               current.next = temp; 
                current = current.prev; 
                } 

		 }
	

	}


