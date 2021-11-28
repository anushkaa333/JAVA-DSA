package Recursion3;

import java.util.Scanner;

//skip a strinf if its not the required string... Skip app if it is not apple
public class Skip_string1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(skip_st("baccapplefg"));
		System.out.println(skip_s("baccappfg"));
	}

	public static String skip_st(String str)
	{
		if(str.isEmpty())
		{
			return "";
		}
		
		if(str.startsWith("app") && !str.startsWith("apple"))
		{
			return skip_st(str.substring(3));
		}
		return str.charAt(0) + skip_st(str.substring(1));
	}
	
	
	public static String skip_s(String str)
	{
		if(str.isEmpty())
		{
			return "";
		}
		
		if(str.startsWith("app") && !str.startsWith("apple"))
		{
			return skip_s(str.substring(3));
		}
		return str.charAt(0) + skip_s(str.substring(1));
	}
}

/*
 * baccapplefg
baccfg
*/
