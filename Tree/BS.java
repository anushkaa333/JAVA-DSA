package Tree;

import java.util.Scanner;

public class BS 
{

	public static Scanner sc  = null;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		Node root = CreateTree();
		//System.out.println(root);
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();

		postorder(root);
		System.out.println();
		
		int ht = height(root);
		System.out.println(ht);
		
		int sz = size(root);// no of nodes
		System.out.println(sz);
		System.out.println();

		levelOrderTraversal(root, ht);

		
	}
	
	public static Node CreateTree()
	{
		Node root = null;
		System.out.println("Enter data : ");
		int data = sc.nextInt();
		
		if(data == -1)
		{
			return null;
		}
		
		root = new Node(data);
		
		System.out.println("Enter left for : "  + data);
		root.left = CreateTree();
		
		System.out.println("Enter right for : "  + data);
		root.right = CreateTree();
		
		return root;
	}
	
	public static void inorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		inorder(root.left);
		System.out.println(root.data + " ");
		inorder(root.right);
	}
	
	public static void preorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.println(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data + " ");
	}
	
	public static int height(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		return Math.max(height(root.left), height(root.right)) + 1;
	}
	
	public static int size(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		return size(root.left) + size(root.right) + 1;
	}
	
	public static void levelOrderTraversal(Node root, int level)
	{
		for(int i = 1; i <= level; i++)
		{
			LOT(root, i);
		}
	}
	
	public static void LOT(Node root, int level)
	{
		if(level == 0)
		{
			return;
		}
		if(level == 1)
		{
			System.out.println(root.data);
		}
		else
		{
			if(level > 1)
			{
				LOT(root.left , level-1 );
				LOT(root.right , level -1);
			}
		}
	}

}



class Node
{
	Node left, right;
	int data;
	
	public Node(int data)
	{
		this.data = data;
	}
}

/*
 * Enter data : 
2
Enter left for : 2
Enter data : 
4
Enter left for : 4
Enter data : 
7
Enter left for : 7
Enter data : 
6
Enter left for : 6
Enter data : 
-1
Enter right for : 6
Enter data : 
-1
Enter right for : 7
Enter data : 
-1
Enter right for : 4
Enter data : 
10
Enter left for : 10
Enter data : 
-1
Enter right for : 10
Enter data : 
-1
Enter right for : 2
Enter data : 
4
Enter left for : 4
Enter data : 
1
Enter left for : 1
Enter data : 
-1
Enter right for : 1
Enter data : 
-1
Enter right for : 4
Enter data : 
-1


6 
7 
4 
10 
2 
9 

2 
4 
7 
6 
10 
9 

6 
7 
4 
10 
9 
2 


Enter data : 
2
Enter left for : 2
Enter data : 
4
Enter left for : 4
Enter data : 
7
Enter left for : 7
Enter data : 
6
Enter left for : 6
Enter data : 
-1
Enter right for : 6
Enter data : 
-1
Enter right for : 7
Enter data : 
-1
Enter right for : 4
Enter data : 
10
Enter left for : 10
Enter data : 
-1
Enter right for : 10
Enter data : 
-1
Enter right for : 2
Enter data : 
8
Enter left for : 8
Enter data : 
1
Enter left for : 1
Enter data : 
-1
Enter right for : 1
Enter data : 
-1
Enter right for : 8
Enter data : 
-1
6 7 4 10 2 1 8 Exception in thread "main" 
2 4 7 6 10 8 1 
6 7 10 4 1 8 2 
4
7

2 4 8 7 10 1 java.lang.NullPointerException: Cannot read field "data" because "root" is null
	at Tree.BS.LOT(BS.java:126)
	at Tree.BS.LOT(BS.java:133)
	at Tree.BS.LOT(BS.java:133)
	at Tree.BS.levelOrderTraversal(BS.java:114)
	at Tree.BS.main(BS.java:30)
*/
