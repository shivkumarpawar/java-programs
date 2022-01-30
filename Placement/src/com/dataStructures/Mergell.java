package com.dataStructures;
import java.util.Scanner;
public class Mergell {
    Node newNode;
    Node traverse;
    Node head1=null;
    Node head2=null;
    Node head;
    int inputValue;
    int totalNumberOfNode;
    
    Node createNewNode(int data,Node head)
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
            traverse=head;
            while(traverse.next!=null)
            {
                traverse=traverse.next;
            }
           traverse.next=newNode;
        }
        
        return head;
    }
    
    
    Node merge(Node head1,Node head2)
    {
        Node p,q;
        p=head1;
        q=head2;
        
        while(p.next !=null)
        {
            p=p.next;
        }
        p.next=q;
        return head1;
    }
    
    
    
    void viewList(Node head)
    {
      
        traverse=head;
        System.out.println("the list  is");
        while(traverse!=null)
        {
           System.out.println(traverse.data);
           traverse=traverse.next;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Mergell l=new Mergell();
        System.out.println("How many nodes you want to create");
		l.totalNumberOfNode=sc.nextInt();
		
        for(int i=0;i<l.totalNumberOfNode;i++)
	     {
			System.out.println("Enter your "+ " "+i + " " +"value for first linked list");
			l.inputValue=sc.nextInt();
			l.head1=l.createNewNode(l.inputValue,l.head1);
          }
            System.out.println(" ");
            l.viewList(l.head1);
        
        for(int i=0;i<l.totalNumberOfNode;i++)
	     {
			System.out.println("Enter your "+ " "+i + " " +"value for second linked list");
			l.inputValue=sc.nextInt();
			l.head2=l.createNewNode(l.inputValue,l.head2);
          }
               System.out.println(" ");
               l.viewList(l.head2);
        
        System.out.println("");
        l.head1=l.merge(l.head1,l.head2);
        System.out.println(" ");
        System.out.println("Merge Linked list is");
        l.viewList(l.head1);
    
        
        
       
        
    }
  }