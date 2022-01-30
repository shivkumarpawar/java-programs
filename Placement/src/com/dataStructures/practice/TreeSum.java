package com.practice;
import java.util.Scanner;


public class TreeSum {

	TreeNode root=null;
	int totalNumberOfNodesInTree;
	int value;
	int sum;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSum t=new TreeSum();
		System.out.println("enter the number of nodes you want in tree");
		t.totalNumberOfNodesInTree=sc.nextInt();
		
		for(int i=0;i<t.totalNumberOfNodesInTree ;i++)
		{
			System.out.println("enter your number");
			t.value=sc.nextInt();
			t.root=t.insertNode(t.value,t.root);
		}
		System.out.println("inorder sequence of tree is :");
		t.inorder(t.root);
		
		
		
		int sum= t.sumOfTree(t.root);
		System.out.println("The sum of nodes in the tree:" +sum);

	}
	

	void inorder(TreeNode root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	
	
	TreeNode insertNode(int data, TreeNode root)
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
	TreeNode createNewNode(int data)
	{
		TreeNode newNode=new TreeNode();
		newNode.left=null;
		newNode.right=null;
		newNode.data=data;
		return newNode;
	}
	
	
	
	
	int sumOfTree(TreeNode root)
	{
		
		if(root!=null)
		{
			sumOfTree(root.left);
			sum=sum+root.data;
			sumOfTree(root.right);
		}
		
		return sum;
		
	}
}
