package javaPractice;
import java.util.Scanner;

import DailyPractice.TNode;
public class DeleteTree {

	TNode root=null;
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DeleteTree t=new DeleteTree();
		System.out.println("enter number of nodes our want to enter");
		int totalNumberOfNodes=sc.nextInt();
		
		for(int i=0;i<totalNumberOfNodes ;i++)
		{
			System.out.println("Enter your number");
			int data=sc.nextInt();
			t.root=t.createTree(t.root,data);
		}
		t.inorder(t.root);
		int totalCount=t.getTotal(t.root);
		System.out.println("total nodes in tree:"+ " " + totalCount);
		
		int leafNode=t.getLeafNode(t.root);
		System.out.println("total number of leaf node"+ " "+ leafNode);
		
		int internalNode=t.getInternalNode(t.root);
		System.out.println("total number of internal nodes"+ " "+ internalNode);
		
		int height=t.heightOfTree(t.root);
		System.out.println("height of tree"+ " "+height);
		
		System.out.println("Please give the value you want to enter");
		
		t.root=t.createTree(t.root, sc.nextInt());
		t.inorder(t.root);
		t.root=t.deleteNode(70, t.root);
		
	}
	
	TNode deleteNode(int data, TNode root)
	{
		if(root==null)
		{
			return root;
		}
		else
		{
			if(data<root.data)
			{
				root.left=deleteNode(data,root.left);
				
			}
			else if(data>root.data)
			{
				root.right=deleteNode(data,root.right);
			}
			else
			{
				if(root.left==null && root.right==null)
				{
					return root.left;
				}
				
				if(root.left==null)
				{
					return root.right;
				}
				if(root.right==null)
				{
					return root.left;
				}
				if(root.left!=null && root.right!=null)
				{
					root.data=min(root.right);
					root.right=deleteNode(root.data,root.right);
					
				}
			}
		}
		return root;
	}
	int min(TNode root)
	{
		TNode temp;
		temp=root;
		while(temp.left!=null)
		{
			temp=temp.left;
		}
		return temp.data;
	}
	int heightOfTree(TNode root)
	{
		int left=0;
		int right=0;
		if(root==null)
		{
			return 0;
		}
		else
		{
			left=heightOfTree(root.left);
			right=heightOfTree(root.right);
			return max(left, right)+1;
		}
		
	}
	int max(int left, int right)
	{
		if(left>right)
			return left;
		else
			return right;
				

	}
	int getInternalNode(TNode root)
	{
		int left=0;
		int right=0;
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return 0;
		else
		{
			left=getInternalNode(root.left);
			right=getInternalNode(root.right);
			
			return left+right+1;
		}
		
	}
	int getLeafNode(TNode root)
	{
		int left=0;
		int right=0;
		if(root==null)
			return 0;
		
		if(root.left==null && root.right==null)
			return 1;
		else
			left=getLeafNode(root.left);
			right=getLeafNode(root.right);
			return left+right;
	}
	
	int getTotal(TNode root)
	{
		if(root==null)
			return 0;
		else
		{
			int left=getTotal(root.left);
			int right=getTotal(root.right);
			
			return left+right+1;
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
	TNode createTree(TNode root, int data)
	{
		if(root==null)
		{
			root=createNode(root,data);
			
		}
		else
		{
			if(data<root.data)
			{
				root.left=createTree(root.left, data);
			}
			else
			{
				root.right=createTree(root.right, data);
			}
		}
		return root;
	}
	
	TNode createNode(TNode root, int data)
	{
		TNode nn=new TNode();
		nn.left=null;
		nn.right=null;
		nn.data=data;
		return nn;
	}
}


