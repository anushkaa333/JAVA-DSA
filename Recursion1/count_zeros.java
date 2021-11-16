package Recursion1;

import java.util.Scanner;
//count number of zeros in number
public class count_zeros {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(count(n));
	}
	public static int count(int n)
	{
		return helper(n,0);
	}
	private static int helper(int n, int count)
	{
		if(n==0)
		{
			return count;
		}
		int rem = n%10;
		if(rem==0)
		{
			return helper(n/10, count+1);
		}
		return helper(n/10, count);
	}

}

/*
 * 
 * 30204
2
*/
