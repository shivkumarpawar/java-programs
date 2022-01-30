//This is the program for finding the middle of the linked list
package com.test;
import java.util.Scanner;

public class MiddleOfLinkedList {
    
	int noOfNodes;
	Node head=null;
	int inputValue;
	Node temp;
	int middleValue;
	
	
	public static void main(String[] args) {
		
		MiddleOfLinkedList a=new MiddleOfLinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of nodes in the linked list");
		 a.noOfNodes=sc.nextInt();
		
		for(int i=0;i<a.noOfNodes;i++)
		{ 
			System.out.println("Enter the" +i +"value");
			  a.inputValue=sc.nextInt();
			a.head=a.createList(a.inputValue,a.head);
		}
		   
		     a.printList(a.head);
		     a.findMiddle(a.head);
		
	}
	//implementation of creating the linked list
	 Node createList(int inputValue,Node head)
	 {
		  Node newNode=new Node();
		  newNode.data=inputValue;
		  newNode.next=null;
		  if(head==null)
		  {
			  head=newNode;
			  return head;
		  }
		  else {
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
	 
	 // implementation of printing List method
	 void printList(Node head)
	 {

			Node temp=head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
	 }
	 
	 //implementation of method adding number at the middle
	 void findMiddle(Node head)
	 {
		 Node temp=null;
		 Node p;
		 Node q;
		 p=q=head;
		// Node newNode=new Node();
		
		  
		 // finding middle number
		 while(q!=null &&  q.next!=null)
			{
			  q=q.next.next;
			  p=p.next;
			}
		 System.out.println("The Middle of Linked list is\n"+p.data);
		
		 
	 }
	 
	

}
