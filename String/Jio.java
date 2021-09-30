package String;

import java.util.Arrays;
import java.util.Scanner;

public class Jio 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch[0]);
	}

}
/*
jgdljhjljk
d

lexicographical smallest string */