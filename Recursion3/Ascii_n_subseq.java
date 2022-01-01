package Recursion3;

import java.util.Scanner;

public class Ascii_n_subseq {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		asciiSubseq("", str1);
		
		
		  /*char ch ='a';
		  System.out.println(ch+0); //97
		  System.out.println(ch+1); //98
		  System.out.println((char)(ch+0));//a
		  System.out.println((char)(ch+1));//b*/
	}
	
	public static void asciiSubseq(String str2, String str1)
	{
		if(str1.isEmpty())
		{
			System.out.println(str2);
			return;
		}
		
		char ch = str1.charAt(0);
		asciiSubseq(str2+ch, str1.substring(1));
		asciiSubseq(str2, str1.substring(1));
		asciiSubseq(str2 + (ch+0), str1.substring(1));
	}
	
}
/*
ab
ab
a
a98
b

98
97b
97
9798*/