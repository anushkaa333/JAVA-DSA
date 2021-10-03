package Recursion;

import java.util.Scanner;

public class factorial
{
	public static int fact(int num)
	{
		if(num == 1 || num ==0 )
		{
			return 1;
		}
		int fact_nm1 = fact(num-1);
		int fact_num = num * fact_nm1;
		return fact_num;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fact(num));
	}

}
