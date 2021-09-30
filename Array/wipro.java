package Array;

import java.util.Arrays;
import java.util.Scanner;

public class wipro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] str1 = str.split();
		int[] str2 = new int[str1.length];
		for(int i=0; i < str1.length; i++)
		{
			str2[i] = Integer.parseInt(str1[i]);
		}
		
		for(int j : str2)
		{
			System.out.println(j);
		}
		
		Arrays.sort(str2);
		System.out.println("abjhgsfj");
		System.out.println(str2[0]);*/
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		
		Arrays.sort(ch);
		System.out.println(ch[0]);
		
		//int val = contains(ch);
		//System.out.println(val);
		
 		
	}

	/*private static int contains(final char[] ch) {
		// TODO Auto-generated method stub
		int number = Integer.parseInt(String.valueOf(ch));
		return number;
	}*/

}
