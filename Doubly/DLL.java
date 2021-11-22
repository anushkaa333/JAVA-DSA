package Doubly;



public class DLL
{

	private Node head;
	
	public void insertFirst(int val)
	{
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if(head!=null)
		{
			head.prev = node;
		}
		head = node;
	}
	
	public void display()
	{
		Node node = head;
		while(node!=null)
		{
			System.out.print(node.val + "-> ");
			node = node.next;
		}
		System.out.println("END");
		
	}
	
	public void displayRev()
	{
		Node node = head;
		Node last = null;
		while(node != null)
		{
			System.out.print(node.val + "->");
			last = node;
			node = node.next;
		}
		System.out.println("End");
		
		
		System.out.println("In Reverse order");
		while(last != null)
		{
			System.out.print(last.val + "->");
			last = last.prev;
		}
		System.out.println("START");
	}
	
	
	public void insertLast(int val)
	{
		Node node = new Node(val);
		node.next = null;
		Node last = head;
		
		if(head == null)
		{
			node.prev = null;
			head = node;
			return;
		}
		
		while(last.next!=null)
		{
			last = last.next;
		}
		
		last.next = node;
		node.prev = last;
		last = node;
	}
	
	public Node find(int value)
	{
		Node node = head;
		while(node!=null)
		{
			if(node.val==value)
			{
				return node;
			}
			node = node.next;
		}
		return null;
	}
	
	public void insertAfter(int after, int value)
	{
		Node p = find(after);
		
		if(p==null)
		{
			System.out.println("Does not exist");
			return;
		}
		
		Node node = new Node(value);
		node.next = p.next;
		p.next.prev = node;
		node.prev = p;
		p.next = node;
	}
	
	private class Node
	{
		int val;
		Node next;
		Node prev;
		
		public Node(int val)
		{
			this.val = val;
		}
		
		public Node(int val, Node next, Node prev)
		{
			this.val = val;
			this.prev = prev;
			this.next = next;
		}
	}

}
