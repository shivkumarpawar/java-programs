package com.dataStructures;
import java.util.Scanner;
public class TestLinkedList {
		
		int totalNumberOfNode;
		int inputValue;
		Node head=null;
		Node temp;
		
		public static void main(String[] args) {
			
			TestLinkedList l=new TestLinkedList();
			Scanner sc=new Scanner(System.in);
			System.out.println("How many nodes you want to create");
			l.totalNumberOfNode=sc.nextInt();
			
			for(int i=0;i<l.totalNumberOfNode;i++)
			
			{
				System.out.println("Enter your value");
				l.inputValue=sc.nextInt();
				l.head=l.createNewNode(l.inputValue,l.head);
			}
			
			    l.printList(l.head);
			   l.removeDuplicates(l.head); 
			   
			   System.out.println("The list After Removing duplicates");
			   
                l.printList(l.head);
		
        }
		
		
		void removeDuplicates(Node head) 

	    { 
          Node traverse = head; 
          while (traverse != null) 
          { 
            Node temp = traverse; 
            while(temp!=null && temp.data==traverse.data) 
          { 
        	  temp = temp.next; 

	       } 
              traverse.next = temp;
              traverse = traverse.next; 

	        } 

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



