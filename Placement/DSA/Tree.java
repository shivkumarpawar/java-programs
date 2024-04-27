package DailyPractice;

import java.util.Scanner;

public class Tree {

	TNode root=null;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Tree t=new Tree();
		
		System.out.println("how many nodes you want to create in tree");
		int numberOfNode=sc.nextInt();
		
		for(int i=0;i<numberOfNode;i++)
		{
			System.out.println("enter your number");
			int data=sc.nextInt();
			t.root=t.createTree(data,t.root);
		}
		
		System.out.println("count for leaf node");
		int leafNodeCount=t.onlyLeafNode(t.root);
		System.out.println(leafNodeCount);
		System.out.println("Only non leaf node");
		int count=t.count(t.root);
		System.out.println(count);
		
	}

	int onlyLeafNode(TNode root)
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
			left = onlyLeafNode(root.left);
			right=onlyLeafNode(root.right);
			return left+right;
	}
	
	int count(TNode root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.left==null && root.right==null)
		{
			return 0;
			
		}
		if(((root.left!=null && root.right==null) || (root.left==null && root.right!=null)) || (root.left!=null && root.right!=null))
		{
			return 1;
		}
		else
		{
			int left=count(root.left);
			int right=count(root.right);
			return left+right;
		}
	}
	void inorder(TNode root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	TNode createTree(int data, TNode root)
	{
		if(root==null)
		{
			root=createNode(data, root);
		}
		else
		{
			if(data<=root.data)
			{
				root.left=createTree(data, root.left);
				
			}
			else
			{
				root.right=createTree(data, root.right);
			}
		}
		return root;
	}
	TNode createNode(int data, TNode root)
	{
		TNode nn=new TNode();
		nn.data=data;
		nn.left=null;
		nn.right=null;
		return nn;
	}
	
	

}
