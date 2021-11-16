package Recursion1;

import java.util.Scanner;

public class product_of_digits {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = product(num);
		System.out.println(ans);
	}
	
	public static int product(int num)
	{
		if(num%10==num)
		{
			return num;
		}
		return (num%10)*product(num/10);
	}

}
/*

55
25

10
0
*/