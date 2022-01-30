//This is the program of tree in which adding node counting leaf nodes and getting total number of nodes..

package com.practice;
import java.util.Scanner;

public class TreeNodesCount {

	TreeNode root=null;
	int totalNumberOfNodesInTree;
	int value;
	int sum;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeNodesCount t=new TreeNodesCount();
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
		
		
		
		int numberOfNode=t.getTotalNumberOfNodes(t.root);
		System.out.println("total number of nodes in tree:" + numberOfNode);
		
		System.out.println("count for leaf node");
		int leafNodeCount=t.countLeafNodes(t.root);
		System.out.println(leafNodeCount);
		
		

	}
	int getTotalNumberOfNodes(TreeNode root)
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
	
	

	void inorder(TreeNode root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	
	// the function used for inserting node in tree
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
	
	// the function used for creating node
	TreeNode createNewNode(int data)
	{
		TreeNode newNode=new TreeNode();
		newNode.left=null;
		newNode.right=null;
		newNode.data=data;
		return newNode;
	}
	
	//function used for counting leaf nodes
	int countLeafNodes(TreeNode root)
	{

		int left=0;
		int right=0;
		if(root==null)
		{
			return 0;
		}
		if(root.left==null && root.right==null)
		{
			return 1;
		}
		else
			left = countLeafNodes(root.left);
			right=countLeafNodes(root.right);
			return left+right;
	}
}








