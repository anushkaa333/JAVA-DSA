package Recursion3;

import java.util.Scanner;

public class Skip_char {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		char t = sc.next().charAt(0);
		
		String str2 = ""; 
		skip(str1, t, str2);
	}
	
	public static void skip(String str1, char t, String str2)
	{
		if(str1.isEmpty())
		{
			System.out.println(str2);
			return;
		}
		
		char ch = str1.charAt(0);
		if(ch==t)
		{
			skip(str1.substring(1), t,  str2);
		}
		else
		{
			skip(str1.substring(1), t, str2 + ch);
		}
	}

}

/*
 * baccdah
a
bccdh*/
