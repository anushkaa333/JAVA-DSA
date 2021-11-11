package Number_System;

import java.util.Scanner;

public class Even_2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		//************FOR EVEN
		int i = 0;
		int num = sc.nextInt();
		int even = 0;
		while(i <= num)
		{
			System.out.print(even);
			i++;
			even = even + 2;
			if(i == num + 1)
			{
				System.out.print(".");
			}
			else
			{
				System.out.print(",");
			}
		}
		/*
		 * 11
1,3,5,7,9,11,13,15,17,19,21,23.

10
0,2,4,6,8,10,12,14,16,18,20.
		 */
		
		
		
		/***************FOR ODD
		 * int i = 0;
		int num = sc.nextInt();
		int even = 0;
		while(i <= num)
		{
			System.out.print(even);
			i++;
			even = even + 2;
			if(i == num + 1)
			{
				System.out.print(".");
			}
			else
			{
				System.out.print(",");
			}
		}
		
		 */
	}
}
