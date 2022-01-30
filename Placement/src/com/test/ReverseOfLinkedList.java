package com.test;
import java.util.Scanner;

import com.dataStructures.Node;
public class ReverseOfLinkedList
{
    int noOfNodes;
	Node head=null;
	int inputValue;
	Node temp;
	int middleValue;
	
	
	public static void main(String[] args) {
		
		ReverseOfLinkedList a=new ReverseOfLinkedList();
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
		    Node head =a.reverseList(a.head);
		
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

