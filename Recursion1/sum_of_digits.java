package Recursion1;

import java.util.Scanner;

public class sum_of_digits {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = sum(num);
		System.out.println(ans);
	}
	
	public static int sum(int num)
	{
		if(num==0)
		{
			return 0;
		}
		
		return (num%10) + sum(num/10);
	}

}
