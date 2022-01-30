package com.dataStructures;
import java.util.Scanner;


public class GeneralizeTree {

	BSTNode root=null;
	int totalNumberOfNodesInBST;
	int value;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		GeneralizeTree t=new GeneralizeTree();
		System.out.println("enter the number of nodes you want in BST");
		t.totalNumberOfNodesInBST=sc.nextInt();
		
		for(int i=0;i<t.totalNumberOfNodesInBST ;i++)
		{
			System.out.println("enter your number");
			t.value=sc.nextInt();
			t.root=t.insertNode(t.value,t.root);
		}
		System.out.println("inorder sequence:");
		t.inorder(t.root);
		System.out.println("preorder sequence:");
		t.preorder(t.root);
		System.out.println("postorder sequence:");
		t.postorder(t.root);
		
		int numberOfNode=t.getTotalNumberOfNodes(t.root);
		System.out.println("total number of nodes in BST:" + numberOfNode);
		
		

	}
	int getTotalNumberOfNodes(BSTNode root)
	{
		int leftSubTreeCount;
		int rightSubTreeCount;
		int totalCount;
		if(root==null)
		{
			return 0;
		}
		else
		{
			leftSubTreeCount=getTotalNumberOfNodes(root.left);
			rightSubTreeCount=getTotalNumberOfNodes(root.right);
			totalCount=leftSubTreeCount+ rightSubTreeCount+1;
			return totalCount;
		}
	}

	void inorder(BSTNode root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	void preorder(BSTNode root)
	{
		if(root!=null)
		{
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	void postorder(BSTNode root)
	{
		if(root!=null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data);
		}
	}
	
	BSTNode insertNode(int data, BSTNode root)
	{
		if(root==null)
		{
			root=createNewNode(data);
			
		}
		else
		{
			if(data<=root.data)
			{
				root.left=insertNode(data,root.left);
			}
			else
			{
				root.right=insertNode(data,root.right);
			}
			
		}
		return root;
		
	}
	BSTNode createNewNode(int data)
	{
		BSTNode newNode=new BSTNode();
		newNode.left=null;
		newNode.right=null;
		newNode.data=data;
		return newNode;
	}
}

	

