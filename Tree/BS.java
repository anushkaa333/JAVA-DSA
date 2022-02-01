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
		System.out.println("Stack Inorder");
		st_inorder(root);
		
		System.out.println();
		System.out.println("Preorder");
		preorder(root);
		
		
		System.out.println();
		System.out.println("Stack Preorder");
		System.out.println(st_preorder(root));
		
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
		
		System.out.println();
		System.out.println("Diameter :" );
		System.out.println(Dia(root));
		
		System.out.println();
		System.out.println("Max path sum :" );
		System.out.println(MPS(root));
		
		System.out.println();
		System.out.println("Boundry level traversal :" );
		System.out.println(blt(root));
		
		System.out.println();
		System.out.println("Zigzag traversal :" );
		zigzag(root); //for void type
		System.out.println(zigzag(root));//for list type
		
		System.out.println();
		System.out.println("Mirror image OR invert tree");
		mirror(root);
		System.out.println("Inorder on Mirror image OR invert tree");
		inorder(root);
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
	
	
	public static void st_inorder(Node root)
	{
		//ArrayList<Integer> list = new ArrayList<Integer>();
		if(root == null)
		{
			return;
		}
		Stack<Node> s = new Stack<Node>();
		Node temp = root;
		while(temp!=null && s.size()>0)
		{
			while(temp!=null)
			{
				s.push(temp);
				/*System.out.print(s.peek().data + " ");
				list.add(temp.data);*/
				temp = temp.left;
			}
			
			temp = s.pop();
			System.out.print(temp.data + " ");
			temp = temp.right;
		}
		//return list;
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
	
	
	public static ArrayList<Integer> st_preorder(Node root)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Node> s = new Stack<Node>();
		Node temp = root;
		while(temp!=null && !s.isEmpty())
		{
			while(temp!=null)
			{
				s.push(temp);
				System.out.print(s.peek().data + " ");
				list.add(temp.data);
				temp = temp.left;
			}
			temp = s.pop();
			temp = temp.right;
		}
		return list;
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

	
	public static ArrayList<Integer> RightView(Node root, int level)
	{
		//Queue<Node> q = new LinkedList<Node>();
		//Stack<Node> st = new Stack<Node>();
		
		ArrayList<Integer> al = new  ArrayList<>();
		RV(root, level, al);
		return al;
		
	}
	
	public static void RV(Node root, int level, ArrayList<Integer> al)
	{
		if(root==null)
		{
			return;
		}
		
		//Node cur = root;
		if(al.size() == level)
		{
			al.add(root.data); // only al.add(root) will throw error or we can create new node cur and add cur.data
			System.out.println(root.data);
		}
		RV(root.right, level+1, al);
		RV(root.left, level+1, al);
		
	
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
	
	public static int Dia(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		int left = Dia(root.left);
		int right = Dia(root.right);
		int cur = height(root.left) + height(root.right) + 1; // call to height function
		return Math.max(cur, Math.max(right, left));
	}
	
	public static int MPS(Node root)
	{
		int max[] = new int[1];
		max[0] = Integer.MIN_VALUE;
		M_P_S(root, max);
		return max[0];
	}
	
	public static int M_P_S(Node root, int max[])
	{
		if(root == null)
		{
			return 0;
		}
		
		int left = Math.max(0, M_P_S(root.left, max));
		int right = Math.max(0, M_P_S(root.right, max));
		max[0] = Math.max(max[0], left + right + root.data);
		return Math.max(left, right) + root.data;
	}
	
	
	public static ArrayList<Integer> blt(Node root)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		if(isLeaf(root) == false)
		{
			al.add(root.data);
		}
		addLeftBoundary(root, al);
		addLeaves(root, al);
		addRightBoundary(root, al);
		return al;
	}
	
	public static boolean isLeaf(Node root)
	{
		if(root.left == null && root.right == null)
		{
			return true;
		}
		return false;
	}
	
	public static void addLeftBoundary(Node root, ArrayList<Integer> al)
	{
		Node cur = root.left;
		while(cur!=null)
		{
			if(isLeaf(cur) == false)
			{
				al.add(cur.data);
			}
			
			if(cur.left!=null)
			{
				cur = cur.left;
			}
			cur = cur.right;
		}
	}
	
	public static void addLeaves(Node root, ArrayList<Integer> al)
	{
		if(isLeaf(root))
		{
			al.add(root.data);
			return;
		}
		
		if(root.left!=null)
		{
			addLeaves(root.left, al);
		}
		if(root.right!=null)
		{
			addLeaves(root.right, al);
		}
	}
	
	public static void addRightBoundary(Node root, ArrayList<Integer> al)
	{
		Node cur = root.right;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		while(cur!=null)
		{
			if(!isLeaf(cur))
			{
				temp.add(cur.data);
			}
			
			if(cur.right!=null)
			{
				cur = cur.right;
			}
			cur = cur.left;
			
		}
		int i ;
		for(i = temp.size() -1 ; i>=0; i--)
		{
			al.add(temp.get(i));
		}
	}
	
	
	public static void zigzag(Node root)
	{
		/*Stack<Node> st1 = new Stack<Node>();
		Stack<Node> st2 = new Stack<Node>();
		st1.push(root);
		while(!st1.isEmpty() || !st2.isEmpty())
		{
			while(!st1.isEmpty())
			{
				Node nd = st1.pop();
				System.out.print(nd.data);
				if(nd.left!=null)
				{
					nd = nd.left;
					st2.push(nd);
				}
				if(root.right!=null)
				{
					nd = nd.right;
					st2.push(nd);
				}
			}
			
			while(!st2.isEmpty())
			{
				Node nd1 = st2.pop();
				System.out.print(nd1.data);
				if(nd1.right!=null)
				{
					nd1 = nd1.right;
					st1.push(nd1);
				}
				if(nd1.left!=null)
				{
					nd1 = nd1.right;
					st1.push(nd1);
				}
			}
		}*/
		
		/*if(root == null)
		{
			return;
		}
		Stack<Node> s1 = new Stack<Node>();
		s1.push(root);
		
		boolean b = true; 
		while(!s1.isEmpty())
		{
			Stack<Node> tempst = new Stack<Node>();
			
			while(!s1.isEmpty())
			{
				Node tempnd = s1.pop();
				System.out.print(tempnd.data + " ");
				if(b)
				{
					if(tempnd.left!=null)
					{
						tempnd = tempnd.left;
						tempst.push(tempnd);
					}
					if(tempnd.right!=null)
					{
						tempnd = tempnd.right;
						tempst.push(tempnd);
					}
				}
				else
				{
					if(tempnd.right!=null)
						tempst.push(tempnd.left);
					
					if(tempnd.left!=null)
						tempst.push(tempnd.right);
				}
			}
			
			s1 = tempst;
			b = !b;
		}
		//2 10 4 10 7 6 (void)*/
		
		/*List<List<Integer>> result = new ArrayList<>();
		boolean flag = true;
		if(root == null)
		{
			return result;
		}
		
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty())
		{
			int size = queue.size();
			List<Integer> list = new ArrayList<>();
			for(int i=0; i < size; i++ )
			{
				Node temp = queue.poll();
				if(flag)
				{
					list.add(temp.data);
				}
				else
				{
					list.add(0, temp.data);
				}
				
				if(temp.left!=null)
				{
					queue.offer(temp.left);
				}
				if(temp.right!=null)
				{
					queue.offer(temp.left);
				}
			}
			result.add(list);
			flag =! flag;
		}
		return result;
		//[[2], [4, 4], [7, 7, 7, 7], [6, 6, 6, 6]] (List<List<Integer>>)*/
	}
	
	public static void mirror(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		mirror(root.left);
		mirror(root.right);
		
		Node temp;
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		
	}
	
	public static Node lca(Node root, int p, int q)
	{
		if(root == null || root.data ==p || root.data ==q)
		{
			return root;
		}
		Node l = lca(root.left, p, q);
		Node r = lca(root.right, p , q);
		
		if(l == null)
		{
			return r; 
		}
		else if(r == null)
		{
			return l;
		}
		else
		return root;
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
 * 						    2
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
[2, 8, 9, 6]
				
				
Check balanced or not
true			

Diameter :
6

Max path sum :
36

Boundry level traversal :
[2, 4, 6, 10, 1, 9, 8]

Mirror image OR invert tree
Inorder on Mirror image OR invert tree
9 8 1 2 10 4 7 6 


Lowest common ancestor

6
9

2

7
10

4
*/
