package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Op {

	Scanner sc =  new Scanner(System.in);
	Stack<Integer> st = new Stack<>();
	int Max_Size = 10; 
	int top = -1;
	
	void push()
	{
		System.out.println("Enter how many elements you want to push:");
		int n = sc.nextInt();
		 
		 if(top == Max_Size)
			{
				System.out.println("Stack overflow");
			}
			
		 else
			 {
			 for(int i = 0; i < n; i++)
			 	{
				
					if(top < (Max_Size -1)) // n < (Max_Size - top)
					{
						st.push(sc.nextInt());
						top++;
					}
			 	}
			 }
		
	}
	
	void display() 
	{
		
		System.out.println("The Stack");
 
		for(int i=0; i<st.size(); i++) {
			
			System.out.println(st.get(i));
		}
	}
	
	void search()
	{
		System.out.println("Enter how many elements you want to search :");
		int l = sc.nextInt();
		
		if(st.search(l) != -1)
		{
			System.out.println("Element found at index " + st.search(l));
		}
		else
		{
			System.out.println("Element found not found");
		}
		
	}
	
	void pop()
	{
		System.out.println("Enter how many elements you want to pop:");
		int m = sc.nextInt();
		
		if(top == -1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			for(int j = m ; j > 0; j--)
			{
				if(m <= top+1)
					{
						st.pop();
						top --;
					}
				else if( m > top+1 )
				{
					for(j = top; j >=0 ; j-- )
					{
						st.pop();
						top --;
					}
				}
			}
		}
	}
	
	void peek()
	{
		if(st.peek() == -1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println(st.peek());
		}
	}
	
	void empty()
	{
		if(st.empty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Stack is not empty");
		}
	}
}
class Main
{
		public static void main(String[] args) 
			{
				
				Stack_Op st1 = new Stack_Op();
				st1.push();
				st1.display();
				st1.search();
				
				st1.pop();
				st1.peek();
				st1.empty();
			}
}


