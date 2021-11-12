package Number_System;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1 ; i <= num ; i++)
		{
			System.out.println(i + " " + isPrime(i));
		}
		
	}

	
	public static boolean isPrime(int n)
	{
		if(n <= 1)
		{
			return false;
		}
		
		
		int c = 2;
		while(c*c<=n)
		{
			if(n % c == 0)
			{
				return false;
			}
			c++;
		}
		return true;
	}
}
/*
1 false
2 true
3 true
4 false
5 true
6 false
7 true
8 false
9 false
10 false
11 true
12 false
13 true
14 false
15 false
16 false
17 true
18 false
19 true
20 false
*/