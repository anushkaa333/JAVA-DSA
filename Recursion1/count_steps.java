package Recursion1;

import java.util.Scanner;

public class count_steps {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(noOfSteps(n));
	}
	
	public static int noOfSteps(int n)
	{
		return helper(n,0);
	}
	
	public static int helper(int n, int steps)
	{
		if(n == 0)
		{
			return steps;
		}
		
		if(n%2==0)
		{
			return helper(n/2, steps+1);
		}
		return helper(n=n-1, steps+1);
	}

}

/*
 * 14
6


input 14
output 6

step 1) 14 is even, divisible by 2 and obtain 7
s 2) 7 is odd, subtract 1 and obtain 6
s3) 6 even, divide by 2, obtain 3
s4) 3 odd, subtract 1, obtain 2
s5) 2 even, divide by 2, obtain 1
s6) 1 is odd, subtract 1, obtain 0

Hence there are total 6 steps required




8
4
*/
