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
				head = tail = temp ;
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
		
		public void addfirst(int val)
		{
			Node temp = new Node();
			temp.data = val;
			temp.next = head;
			head = temp;
			if(size == 0)
			{
				tail = temp;
			}
			size++;
		}
		
		public void addAt(int val, int idx)
		{
			if(idx < 0 || idx > size)
			{
				System.out.println("Invalid");
			}
			else if(idx == 0)
			{
				addfirst(val);
			}
			else if(idx == size)
			{
				addLast(val);
			}
			else
			{
				Node node = new Node();
				node.data = val;
				Node temp = head;
				for(int i=0; i<idx - 1; i++)
				{
					temp = temp.next;
				}
				node.next = temp.next;
				temp.next = node;
			}
			
		}
		
		public void removelast()
		{
			if(size == 0)
			{
				System.out.println("List is empty");
			}
			else if(size == 1)
			{
				head = tail = null;
				size = 0;
			}
			else
			{
				Node temp = head;
				for(int i = 0; i < size - 2; i++)
				{
					temp = temp.next;
				}
				tail = temp;
				temp.next = null;
				size -- ;
			}	
		}
		
		public int mid()
		{
			Node s = head;
			Node f = head;
			
			while(f.next != null && f.next.next !=null)
			{
				s = s.next;
				f = f.next.next;
			}
			return s.data;
		}
		
		public int kth_ele(int idx)
		{
			Node s = head;
			Node f = head;
			
			for(int i=0; i < idx; i++)
			{
				f = f.next;
			}
			
			while(f.next!=null)
			{
				s = s.next;
				f = f.next;
			}
			
			return s.data;
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
			if(str.startsWith("addfirst"))
			{
				int val = Integer.parseInt(br.readLine());
				 list.addfirst(val);
				
			}
			if(str.startsWith("addAt"))
			{
				int val = Integer.parseInt(br.readLine());
				int idx = Integer.parseInt(br.readLine());
				 list.addAt(val, idx);
				
			}
			if(str.startsWith("removeLast"))
			{
				list.removelast();
			}
			if(str.startsWith("mid"))
			{
				int val = list.mid();
				System.out.println(val);	
			}
			if(str.startsWith("kth"))
			{
				int idx = Integer.parseInt(br.readLine());
				int val = list.kth_ele(idx);
				System.out.println(val);	
			}
		}
	}

}
