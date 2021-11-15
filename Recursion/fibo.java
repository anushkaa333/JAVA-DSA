package Recursion;

import java.util.Scanner;
//Calculate nth fib number
public class fibo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = fibo(num);
		System.out.println(ans);
	}

	
	public static int fibo(int num)
	{
		if(num<2)
		{
			return num;
		}
		return fibo(num-1) + fibo(num-2);
	}
}
/*
 * 
 *
 
 2
1
 
3
2


4
3


5
5

*/