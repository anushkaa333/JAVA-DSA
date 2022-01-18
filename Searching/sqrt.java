package Searching;

import java.util.Scanner;

// Find square root of number
public class sqrt 
{
	public static int sq(int num)
	{
		// TODO Auto-generated method stub
		int start = 0;
		int end  = num;
		int mid = start + (end - start)/2;
		int ans = -1;
		while(start < end)
		{
			int square = mid*mid;
			if(square == num)
				return mid;
			
			if(square < num)
			{
				ans = mid;
				start = mid+ 1;
			}
			else
			{
				end = mid - 1;
			}
			mid = start + (end - start)/2;
		}
		return ans;
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		System.out.println(sq(num));
	}

}
/*
 * 4
 * 2*/
