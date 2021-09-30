package String;

import java.util.Scanner;

public class reverse 
{
	public static String reverse(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		char[] ch1 = new char[ch.length];
		int i=0;
		for(int j=ch.length - 1; j >= 0; j--)
		{
			ch1[i] = ch[j];
			i++;
		}
		
		for(char c : ch1)
		{
			System.out.print(c);
		}
		System.out.println();*/

		// OR string builder class from String package, palindrome class
		
		/*for(int k=0; k < ch1.length; k++)
		{
			if(ch1[k] != 'a'|| ch1[k] != 'e' || ch1[k] != 'i'|| ch1[k] != 'o'|| ch1[k] != 'u' )
			{
				System.out.print(ch1[k]);

			}
			
		} UNEXECUTABLE for loop */
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		
		String str2 = " ";
		str2 = str.replaceAll("[aeiou]", " ");
		
		String str1 = reverse(str2);
		System.out.println(str1);
		
		
		System.out.println(str2);
		
		
	}
	//REFER Github, some changes are done here 1] Remove vowels 2] Reverse
}
/*
anushka
 khs n 
 n shk
*/