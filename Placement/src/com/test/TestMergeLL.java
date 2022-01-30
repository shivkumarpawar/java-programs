package com.test;
import java.util.Scanner;

import com.dataStructures.Dnode;
public class TestMergeLL {
    Dnode newNode;
    Dnode traverse;
    Dnode head1=null;
    Dnode head2=null;
    Dnode head;
    int inputValue;
    int totalNumberOfNode;
    
    
      public class Dnode {
    	Dnode prev;
    	int data;
    	Dnode next;
       }
    
     

    
       public static void main(String[] args)
       {
        Scanner sc=new Scanner(System.in);
        TestMergeLL l=new TestMergeLL();
        System.out.println("How many nodes you want to create");
		l.totalNumberOfNode=sc.nextInt();
		
         for(int i=0;i<l.totalNumberOfNode;i++)
	     {
			System.out.println("Enter your "+ " "+i + " " +"value for first linked list");
			l.inputValue=sc.nextInt();
			l.head1=l.createNewNodeForDouble(l.inputValue,l.head1);
          }
            System.out.println(" ");
            l.viewList(l.head1);
        
           for(int i=0;i<l.totalNumberOfNode;i++)
	        {
			System.out.println("Enter your "+ " "+i + " " +"value for second linked list");
			l.inputValue=sc.nextInt();
			l.head2=l.createNewNodeForDouble(l.inputValue,l.head2);
             }
               System.out.println(" ");
               l.viewList(l.head2);
        
        System.out.println("");
        l.head=l.merge(l.head1,l.head2);
        System.out.println(" ");
        System.out.println("Merge Linked list is");
        l.viewList(l.head);
    }
       
       Dnode createNewNodeForDouble(int data, Dnode head)
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
   	
       
       Dnode merge(Dnode head1,Dnode head2)
       {
          Dnode p;
           Dnode q;
           p=head1;
           q=head2;
           
           while(p.next !=null)
           {
               p=p.next;
           }
             p.next=q;
           return head1;
       }
       
       
       
       void viewList(Dnode head)
       {
           Dnode traverse;
           traverse=head;
           System.out.println("the list  is");
           while(traverse!=null)
           {
              System.out.println(traverse.data);
              traverse=traverse.next;
           }
       }
       
       
  }