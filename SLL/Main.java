package SLL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

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
				temp = head = tail;
			}
			else
			{
				tail.next = temp;
				temp = tail;
			}
			size++;
		}
		
		public int size()
		{
			return size;
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
		
		
		public void removefirst()
		{
			if(size==0)
			{
				System.out.println("Linked list is empty");
			}
			else if(size==1)
			{
				head = tail = null;
				size = 0;
			}
			else
			{
				head = head.next;
				size--;
			}
		}
		
		public int getFirst()
		{
			if(size==0)
			{
				System.out.println("List is empty");
				return -1;
			}
			else
				return head.data;
		}
		
		public int getLast()
		{
			if(size==0)
			{
				System.out.println("List is empty");
				return -1;
			}
			else
				return tail.data;
		}
		
		public int getAt(int idx)
		{
			if(size==0)
			{
				System.out.println("List is empty");
				return -1;
			}else if(idx < 0 || idx >=size)
			{
				System.out.println("Invalid arguments");
				return -1;
			}
			else
			{
				Node temp = new Node();
				temp = head;
				for(int i=0; i<idx; i++)
				{
					temp = temp.next;
				}
				return temp.data;
			}
				
		}
	}
	
	
	
	public static void testLink(LinkedList list)
	{
		for(Node temp = list.head; temp!=null; temp=temp.next)
		{
			System.out.println(temp.data);
		}
		System.out.println(list.size);
		
		if(list.size>0)
		{
			System.out.println(list.tail.data);
		}
	}
	
	
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList list = new LinkedList();
		
		String str = br.readLine();
		while(str.equals("quit") == false)
		{
			if(str.startsWith("addLast"));
			{
				int val = Integer.parseInt(str.split("")[1]);
				list.addLast(val);
			}
			if(str.startsWith("size"))
			{
				list.size();
			}
			if(str.startsWith("display"))
			{
				list.display();
			}
			if(str.startsWith("removefirst"))
			{
				list.removefirst();
			}
			if(str.startsWith("getfirst"))
			{
				int val = list.getFirst();
				if(val!=-1)
				{
					System.out.println(val);
				}
			}
			if(str.startsWith("getLast"))
			{
				int val = list.getLast();
				if(val!=-1)
				{
					System.out.println(val);
				}
			}
			if(str.startsWith("getAt"))
			{
				int idx = Integer.parseInt(br.readLine()); // OR int idx = Integer.parseInt(str.split("")[1]);
				int val = list.getAt(idx);
				if(val!=-1)
				{
					System.out.println(val);
				}
			}
		}
	}

}
