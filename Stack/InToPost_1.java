package Stack;

import java.util.Scanner;
import java.util.Stack;

public class InToPostfix
{
	public static int precedance(char ch)
	{
		switch(ch)
		{
			case '^' :
				return 3;
			
			case '/' :
				return 2;
			
			case '*' :
				return 2;
				
			case '+' :
				return 1;
				
			case '-' :
				return 1;
				
				default :
					return 0;
				
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Character> s = new Stack<Character>();
		System.out.println("Enter string:");
		String str = "a+b*(c^d-e)^(f+g*h)-i";
		//char[] chrr = new char[str.length()];
		String str1 ="";
		int j=0;
		for(int i=0; i < str.length() ; i++ )
		{
			char ch = str.charAt(i);
			switch(ch)
			{
				case '(':
				{
					s.push('(');
					break;
				}
					
				case ')' :
				{
					while(s.pop() != '(')
					{
						char chh = s.pop();
						//chrr[j++] = chh; 
						str1 = str1 + chh;
					}
					break;
				}
				
				case '+' :
				{
					while(!s.isEmpty() && precedance(s.peek()) >= precedance(ch))
					{
						//chrr[j++] = s.pop();
						char chh = s.pop();
						str1 = str1 + chh;
					}
					s.push(ch);
					break;
				}
				
				case '-' :
				{
					while(!s.isEmpty() && precedance(s.peek()) >= precedance(ch))
					{
						//chrr[j++] = s.pop();
						char chh = s.pop();
						str1 = str1 + chh;
					}
					s.push(ch);
					break;
				}
				
				case '/' :
				{
					while(!s.isEmpty() && precedance(s.peek()) >= precedance(ch))
					{
						//chrr[j++] = s.pop();
						char chh = s.pop();
						str1 = str1 + chh;
					}
					s.push(ch);
					break;
				}
				
				case '*' :
				{
					while(!s.isEmpty() && precedance(s.peek()) >= precedance(ch))
					{
						//chrr[j++] = s.pop();
						char chh = s.pop();
						str1 = str1 + chh;
					}
					s.push(ch);
					break;
				}
					
				default :
				{
					//chrr[j++] = ch;
					str1 = str1  + ch;
					break;
				}
			}
		}
		while(!s.isEmpty())
		{
			//chrr[j++] = s.pop();
			char chh = s.pop();
			str1 = str1 + chh;
		}
		
//		for(int k : chrr)
//		{
//			System.out.print(k);
//		}
		
		System.out.println(str1);
	
	}

}
/*
Exception error in o/p*/
