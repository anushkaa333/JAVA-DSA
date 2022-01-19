package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BS 
{

	public static Scanner sc  = null;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		//int choice =0 ;
		Node root = CreateTree();
		//System.out.println(root);
		/*while(choice!=5)
		{
			System.out.println("\n1.Inorder\n2.Pre\n3.Post\n4.Height\n5.No of nodes\n6.Level order using recursion\n7.Level order using queue ");
			System.out.println("\n Enter your choice \n");        
	        choice = sc.nextInt(); 
	        switch(choice)
	        {
	        case 1 :
	        	{
	        		System.out.println("Inorder");
	        		inorder(root);
	        		break;
	        	}
	        case 2 :
        		{
        			System.out.println("Preorder");
        			preorder(root);
        			break;
        		}
	        case 3 :
        		{
        			System.out.println("Postorder");
        			postorder(root);
        			break;
        		}
	        case 4 :
        		{
        			System.out.println("Height of tree");
        			int ht = height(root);
        			System.out.println(ht);
        		}
	        case 5 :
        		{
        			System.out.println("no of nodes in tree");
        			int sz = size(root);
        			System.out.println(sz);
        		}
	        case 6 :
        		{
        			System.out.println("Level order using recursion : ");
        			levelOrderTraversal(root, ht); // error not accepting ht value from case 4.. so need to write function 
        		}
        	
	        }
		}*/
		System.out.println();
		System.out.println("Inorder");
		inorder(root);
		
		System.out.println();
		System.out.println("Preorder");
		preorder(root);
		
		System.out.println();
		System.out.println("Postorder");
		postorder(root);
		
		System.out.println();
		System.out.println("Height of tree");
		int ht = height(root);
		System.out.println(ht);
		
		System.out.println();
		System.out.println("no of nodes in tree");
		int sz = size(root);
		System.out.println(sz);
		
		//System.out.println("Level order using recursion : ");
		//levelOrderTraversal(root, ht);
		
		System.out.println();
		System.out.println("Level order using queue : ");
		PrintLevelOrder(root);
		
		System.out.println();
		System.out.println("Left view" );
		LeftView(root, 0);

		System.out.println();
		System.out.println("Right view" );
		System.out.println(RightView(root, 0));
		
		
		System.out.println();
		System.out.println("Check balanced or not" );
		System.out.println(Bal(root));
		
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
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	public static void preorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.data + " ");
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
		System.out.print(root.data + " ");
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
			System.out.print(root.data + " ");
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
	
	//using queue
	public static void PrintLevelOrder(Node root)
	{
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node cur = q.poll();
			System.out.print(q.poll() + " ");
			
			if(cur.left != null)
				q.add(cur.left);
			
			if(cur.right != null)
				q.add(cur.right);
				
		}
	}
	
	public static void LeftView(Node root, int level)
	{
		Queue<Node> q = new LinkedList<Node>();
		Stack<Node> st = new Stack<Node>();
		
		ArrayList<Node> al = new  ArrayList<>();
		LV(root, level, al);
		
		
	}
	
	public static void LV(Node root, int level, ArrayList<Node> al)
	{
		if(root==null)
		{
			return;
		}
		
		if(al.size() == level)
		{
			al.add(root);
			System.out.println(root.data);
		}
		
		LV(root.left, level+1, al);
		LV(root.right, level+1, al);
	
	}

	
	public static ArrayList<Node> RightView(Node root, int level)
	{
		//Queue<Node> q = new LinkedList<Node>();
		//Stack<Node> st = new Stack<Node>();
		
		ArrayList<Node> al = new  ArrayList<>();
		RV(root, level, al);
		return al;
		
	}
	
	public static void RV(Node root, int level, ArrayList<Node> al)
	{
		if(root==null)
		{
			return;
		}
		
		if(al.size() == level)
		{
			al.add(root);
			System.out.println(root.data);
		}
		LV(root.right, level+1, al);
		LV(root.left, level+1, al);
		
	
	}
	
	public static boolean Bal(Node root)
	{
		return CheckBal(root)!=-1;
	}
	
	public static int CheckBal(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		int left_height =  CheckBal(root.left);
		if(left_height == -1)
		{
			return -1;
		}
		
		
		int right_height = CheckBal(root.right);
		if(left_height == -1)
			return -1;
		
		
		if(Math.abs(left_height - right_height) > 1)
		{
			return -1;
		}
		return Math.max(CheckBal(root.left), CheckBal(root.right)) + 1;
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
 * 							2
						  /   \
						 4      8
						/ \    / \
					   7  10   1  9
					  /
					 6
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
9
Enter left for : 9
Enter data : 
-1
Enter right for : 9
Enter data : 
-1

Inorder
6 7 4 10 2 1 8 9 
Preorder
2 4 7 6 10 8 1 9 
Postorder
6 7 10 4 1 9 8 2 
Height of tree
4

no of nodes in tree
8

Level order using queue : 
null Tree.Node@7cca494b Tree.Node@7ba4f24f null 

Left view
2
4
7
6


Right view
2
8
1
6
[Tree.Node@58372a00, Tree.Node@7cca494b, Tree.Node@4dd8dc3, Tree.Node@6d03e736]
				
				
Check balanced or not
true			

Diameter :
6

*/
