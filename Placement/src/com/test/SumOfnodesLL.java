package com.test;

import java.util.Scanner;

public class SumOfnodesLL {
	int TotalNoOfNodes;
	int inputvalue;
	Node head=null;
	Node temp;
	Node newNode;
	
	public class Node {
		int data;
		Node next;

	}


	public static void main(String[] args) {
		SumOfnodesLL l = new SumOfnodesLL();
		System.out.println("Enter number of nodes to create");
		Scanner sc=new Scanner(System.in);
		l.TotalNoOfNodes=sc.nextInt();
		
		for(int i=0;i<l.TotalNoOfNodes;i++)
		{
			System.out.println("Enter your"+" "+i+" "+"Value");
			l.inputvalue=sc.nextInt();
			l.head=l.createNewnode(l.inputvalue, l.head);
		}
		
		System.out.println("Your linklist is :");
		l.temp=l.head;
		while(l.temp!=null)
		{
			System.out.println(l.temp.data);
			l.temp=l.temp.next;
			
		}
		
		l.SumOfNodes(l.head);
		
		
		

	}
	Node createNewnode(int value , Node head)
	   {
		Node newNode = new Node();
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
	void SumOfNodes(Node head)
	{
		temp=head;
		int sum=0;
		while(temp!=null)
		{
			sum=sum+temp.data;
			temp=temp.next;
		}
		System.out.println("Sum of nodes of LinkList is :" +sum);
		
	}


}
