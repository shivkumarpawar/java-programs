package com.dataStructures;

import java.util.Scanner;

public class DeleteNode {

	Node head;
	Node newNode;
	Node temp;
	int sizeOfLinklist;
	int value;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DeleteNode l=new DeleteNode();
		System.out.println("Enter number of nodes your want to enter");
		l.sizeOfLinklist=sc.nextInt();
		for(int i=0;i<l.sizeOfLinklist;i++)
		{
			System.out.println("enter your"+ " "+ i+ " "+"value");
			l.value=sc.nextInt();
			l.head=l.createLinkList(l.value, l.head);
		}
		l.temp=l.head;
		while(l.temp!=null)
		{
			System.out.println(l.temp.data);
			l.temp=l.temp.next;
		}
		System.out.println("deleting 30 from linklist");
		l.head=l.deleteNode(30, l.head);
		l.temp=l.head;
		while(l.temp!=null)
		{
			System.out.println(l.temp.data);
			l.temp=l.temp.next;
		}
		
		
		
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
	
	Node createLinkList(int data, Node head)
	{
		newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		
		if(head==null)
		{
			head=newNode;
			
		}
		else
		{
			Node t;
			t=head;
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next=newNode;
			

		}
		
		return head;
	}
	
}
