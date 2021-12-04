package SLL;

import java.util.Scanner;

class dlt_ll
{
	
	private Node head;
	private Node tail;
	
	private int size;
	
	public dlt_ll()
	{
		size =0;
	}
	
	
	public void insertF(int n)
	{
		Node node = new Node(n);
		node.next = head;
		head = node;
		if(tail == null)
		{
			tail = head;
		}
		size = size + 1;
	}
	
	
	public void insertL(int n)
	{
		if(tail == null)
		{
			insertF(n);
			return;
		}
		Node node = new Node(n);
		tail.next = node;
		tail = node;
		size++;
	}
	
	
	public void insert(int n, int in)
	{
		if(in==0)
		{
			insertF(n);
			return;
		}
		
		if(in==size)
		{
			insertL(n);
			return;
		}
		
		Node temp = head;
		for(int i=1; i < in; i++)
		{
			temp = temp.next;
		}
		
		Node node = new Node(n, temp.next);
		temp.next = node;
		size++;
		
	}
	
	
	public void display()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.value + "->");
			temp=temp.next;
		}
		System.out.println("END");
	}
	
	
	//*************** Removal *********************
	public Node removeNth(Node head, int n)
	 {
	 	if(head.next==null)
	 	{
	 		return null;
	 	}
	 	
	 	int size = 0;
	 	Node curr = head;
	 	while(curr!=null)
	 	{
	 		curr = curr.next;
	 		size++;
	 	}
	 	
	 	if(n==size)
	 	{
	 		return head.next;
	 	}
	 	
	 	int indexToSearch = size - n;
	 	Node prev = head;
	 	int i=1;
	 	while(i<indexToSearch)
	 	{
	 		prev= prev.next;
	 	}
	 	prev.next = prev.next.next;
	 	return head;
	 }
	
	
	
	private class Node
	{
		private int value;
		private Node next;
		
		public Node(int value)
		{
			this.value = value;
		}
		
		public Node(int value, Node next)
		{
			this.value = value;
			this.next = next;
		}
	}
}


public class dlt_frm_end 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		dlt_ll ll = new dlt_ll();
		Scanner sc = new Scanner(System.in);
		int choice=0;
		while(choice!=6)
		{
			System.out.println("1. Insert (Last) 2. Insert first  3. Insert at any position 4. Display 5. Delete nth from last 6. Exit");
			System.out.println("Enter your choice:");
			choice = Integer.parseInt(sc.nextLine());
			switch(choice)
			{
			
				case 1:
					int num1 = Integer.parseInt(sc.nextLine());
					ll.insertL(num1);
					break;
				
				
				case 2:
					int num2 = Integer.parseInt(sc.nextLine());
					ll.insertF(num2);
					break;
			
			
				case 3:
					int num3 = Integer.parseInt(sc.nextLine());
					int index = Integer.parseInt(sc.nextLine());
					ll.insert(num3, index);
					break;
					
				case 4:
					
					ll.display();
					break;
					
					
				case 5 :
					int index5 = Integer.parseInt(sc.nextLine());
					//Node nnode =  new removeNth(dlt_ll.head, index);
					
				case 6:
					System.exit(0);
					break;
			}
			
		}
	}

}
