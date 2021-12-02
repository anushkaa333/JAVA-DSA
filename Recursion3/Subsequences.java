package Recursion3;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequences {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		//subseq("", str1);
		subseqRt("", str1);
	}

	public static void subseq(String str2, String str1)
	{
		if(str1.isEmpty())
		{
			System.out.println(str2);
			return;
		}
		
		char ch = str1.charAt(0);
		subseq(str2+ch, str1.substring(1));
		subseq(str2, str1.substring(1));
	}
	
	//in array list
	public static ArrayList<String> subseqRt(String str2, String str1)
	{
		if(str1.isEmpty())
		{
			ArrayList<String> list = new ArrayList<>();
			list.add(str2);
			return list;
		}
		
		char ch = str1.charAt(0);
		ArrayList<String> left = subseqRt(str2+ch, str1.substring(1));
		ArrayList<String> right = subseqRt(str2, str1.substring(1));
		
		left.addAll(right);
		return left;
	}
}
/*
abc
abc
ab
ac
a
bc
b
c

[abc, ab, ac, a, bc, b, c, ]


abcd
abcd
abc
abd
ab
acd
ac
ad
a
bcd
bc
bd
b
cd
c
d
[abcd, abc, abd, ab, acd, ac, ad, a, bcd, bc, bd, b, cd, c, d, ]
*/
