package Recursion3;

import java.util.Scanner;

public class Skip_string {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//String str1 = sc.nextLine();
		
		System.out.println(skip_str("baccapplefg"));
	}
	
	public static String skip_str(String str)
	{
		if(str.isEmpty())
		{
			return "";
		}
		
		if(str.startsWith("apple"))
		{
			return skip_str(str.substring(5));
		}
		return str.charAt(0) + skip_str(str.substring(1));
	}

}
/*
baccfg*/