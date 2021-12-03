package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Br(str);
	}
	
	
	public static void Br(String str)
	{
		boolean isBal = true;
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='[' || ch=='(' || ch=='{')
			{
				stack.push(ch);
				continue;
			}
			
			if(stack.isEmpty())
			{
				isBal = false;
				break;
			}
			
			if(ch==')')
			{
				if(stack.peek()=='(')
				{
					stack.pop();
				}
				else
				{
					isBal = false;
					break;
				}
			}
			
			if(ch=='}')
			{
				if(stack.peek()=='{')
				{
					stack.pop();
				}
				else
				{
					isBal = false;
					break;
				}
			}
			
			
			if(ch==']')
			{
				if(stack.peek()=='[')
				{
					stack.pop();
				}
				else
				{
					isBal = false;
					break;
				}
			}
		}
		
		if(!stack.isEmpty())
		{
			isBal = false;
			
		}
		if(isBal)
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println(" Not Balanced");
		}
		
	}
}

/*
 * {([])}
Balanced

{}[]
Balanced


{{[]}
 Not Balanced
*/
