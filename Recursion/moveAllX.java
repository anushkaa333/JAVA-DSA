package Recursion;

import java.util.Scanner;

public class moveAllX
{
	
	public static void moveAx(String str1, int count, int index, String str2)
	{
		if(index == str1.length())
		{
			for(int i =0; i < count ; i++)
			{
				str2 = str2 + 'x';
			}
			System.out.println(str2);
		}
		
		char currChar = str1.charAt(index);
		if(currChar == 'x')
		{
			count++;
			moveAx(str1, count, index + 1, str2);
		}
		else
		{
			str2 = str2 + currChar;
			moveAx(str1, count, index + 1, str2);
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		
		String str2 = " "; 
		moveAx(str1, 0, 0, str2);
	}

}

/*
 * 
 * axbcxxd
 abcdxxx
 */
