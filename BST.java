//package javaPractice;

public class BST {
	
	
	public class BSTNode
{
	BSTNode root;
	int data;
	BSTNode left;
	BSTNode right;
}

	BSTNode root=null;
	public static void main(String[] args) {
		BST b=new BST();
		
		b.root=b.insertNode(4,b.root);
		b.root=b.insertNode(6,b.root);
		b.root=b.insertNode(2,b.root);
		b.root=b.insertNode(0,b.root);
		b.root=b.insertNode(11,b.root);
		b.root=b.insertNode(9,b.root);
		b.root=b.insertNode(5,b.root);
		b.root=b.insertNode(3,b.root);
		System.out.println("---------------");
		b.inorder(b.root);
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
				root.left=insertNode(data, root.left);
			}
			else
			{
				root.right=insertNode(data, root.right);
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
