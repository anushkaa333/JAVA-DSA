package String;

import java.util.Scanner;

public class addn_of_chars {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count =0;
		for(int i =0; i < str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				int ans = str.charAt(i) - 'a' + 1;
				count = count + ans; 
			}
			else
			{
				if(str.charAt(i)>='A' && str.charAt(i)<='Z')
				{
					int ans = str.charAt(i) - 'A' + 1 + 26;
					count = count + ans; 
				}
			}
		}
		System.out.println(count);
	}

}


/*
 * 
 *
a
1

aB
29

ab
3
 */

