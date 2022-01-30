package com.test;

import java.util.Scanner;

public class CheckCycleDoubleLL {
	int NumberOfNodes;
	int inputvalue;
	Dnode head;
	Dnode last;
	Dnode temp;
	Dnode p;
	Dnode q;

	public static void main(String[] args)
	{
		CheckCycleDoubleLL l= new CheckCycleDoubleLL();
		Scanner sc= new Scanner(System.in);
		System.out.println("How many nodes you want to create");
		l.NumberOfNodes=sc.nextInt();
		for(int i=0;i<l.NumberOfNodes;i++)
		{
			System.out.println("Enter your "+ " "+i + " " +"value");
			l.inputvalue=sc.nextInt();
			l.head=l.createnewnode(l.inputvalue, l.head);
		}
		l.temp=l.head;
		
		while(l.temp.next!=null)
		{
			l.temp=l.temp.next;
		}
		
		
		l.temp.next=l.head;
		System.out.println();
		l.p=l.head;
		l.q=l.head.next;
		while(l.q!=l.p)
		{
			l.p=l.p.next;
			l.q=l.q.next.next;
			if(l.q==l.p) {
				System.out.println("The link linst is cyclic");
				break;
			}
			else 
			{
				continue;
			}
		
		}
}

	Dnode createnewnode(int value, Dnode head)
	{
		Dnode newnode=new Dnode();
		newnode.data=value;
		newnode.next=null;
	
	        if(head == null) {  
	            head = last = newnode;  
	             head.prev = null;   
	             last.next = null;  
	        }  
	        else
	        {  
	            
	        	last.next = newnode;  
	            newnode.prev = last;  
	            last = newnode;    
	            last.next = null;  
	        }  
	return head;
	}
	}