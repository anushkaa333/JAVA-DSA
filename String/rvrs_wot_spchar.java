package String;

import java.util.Scanner;

public class rvrs_wot_spchar {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		System.out.println("Input string : " + str);
		reverse(ch);
		String revStr = new String(ch);
		System.out.println("Output string :" + revStr);
	}
	
	public static void reverse(char[] ch)
	{
		int l=0;
		int r = ch.length-1;
		while(l<r)
		{
			if(!Character.isAlphabetic(ch[l]))
			{
				l++;
			}
			else if(!Character.isAlphabetic(ch[r]))
			{
				r--;
			}
			else
			{
				char temp = ch[l];
				ch[l] = ch[r];
				ch[r] = temp;
				l++;
				r--;
			}
		}
	}

}

/*
 * 
 * "a,b$c"
Input string : "a,b$c"
Output string :"c,b$a"*/
