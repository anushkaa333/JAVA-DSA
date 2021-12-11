package SLL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import SLL.Main.Node;

public class Merge_LL
{
	
	public static class Node
	{
		int data;
		Node next;
	}
	
	public static class LinkedList
	{
		Node head;
		Node tail;
		int size;
		
		void addLast(int val)
		{
			Node temp = new Node();
			temp.data = val;
			temp.next = null;
			if(size==0)
			{
				head = tail = temp ;
			}
			else
			{
				tail.next = temp;
				temp = tail;
			}
			size++;
		}
		
		public void display()
		{
			Node temp = head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp = temp.next;
			}
			System.out.println();
		}
		
		public static LinkedList merge(LinkedList l1, LinkedList l2)
		{
			Node one = l1.head;
			Node two = l2.head;
			
			LinkedList res = new LinkedList();
			
			while(one!=null && two!=null)
			{
				if(one.data < two.data)
				{
					res.addLast(one.data);
					one = one.next;
				}
				else
				{
					res.addLast(two.data);
					two = two.next;
				}
			}
			
			while(one!=null)
			{
				
					res.addLast(one.data);
					one = one.next;
			}
			
			while(one!=null && two!=null)
			{
				
					res.addLast(two.data);
					two = two.next;
				
			}
			
			return res;
		}
		
	}

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n1 = sc.nextInt();
		LinkedList l1 = new LinkedList();
		int[] val1 = new int[n1];
		//String[] val1 = br.readLine().split(" ");
		for(int i=0; i < n1; i++)
		{
			val1[i] = sc.nextInt();
			l1.addLast(val1[i]);
		}
		
		
		
		int n2 = sc.nextInt();
		LinkedList l2 = new LinkedList();
		int[] val2 = new int[n2];
		//String[] val1 = br.readLine().split(" ");
		for(int i=0; i < n2; i++)
		{
			val2[i] = sc.nextInt();
			l2.addLast(val2[i]);
		}
		System.out.println("First");
		l1.display();
		System.out.println("Second");
		l2.display();
		
		LinkedList result = LinkedList.merge(l1,l2);
		result.display();
	}

	
	

}
