package String;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean pali(String str1, String str2)
	{
		
		for(int i=0; i < str1.length(); i++)
		{
			 if(str1.charAt(i) != str2.charAt(i))
			{
				return false;
				
			}
		}
		return true;
	}

	public static String reverseString(String str1)
	{
		StringBuilder sb = new StringBuilder(str1);
		sb.reverse();
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str1 = sc.nextLine();
		
		String str2 = reverseString(str1);
		System.out.println(str2);
		
		boolean b = pali(str1, str2);
		System.out.println(b);
	}

}
