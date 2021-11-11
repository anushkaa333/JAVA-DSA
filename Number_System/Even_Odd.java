package Number_System;

import java.util.Scanner;
// To find even numbers till given number 
public class Even_Odd 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter a number : ");
		Scanner sc =  new Scanner(System.in);
		//int n = sc.nextInt();
		//System.out.println(isOdd(n));
		
		int count = sc.nextInt() ;
		for(int i = 0; i < count ; i++)
		{
			if((i & 1) != 1)
			{
				System.out.print(i);
				
				if((count & 1) == 1)// if count number is even
				{
					if(i==count - 1)
					{
						System.out.print(".");
					}
					else
					{
						System.out.print(" , ");
					}
				}
				else //if count is odd
				{
					if(i==count - 2)
					{
						System.out.print(".");
					}
					else
					{
						System.out.print(" , ");
					}
				}
			}
			
		}

	}
}
	/*public static boolean isOdd(int n)
	{
		return (n & 1) ==1;
	}*/

	

/*
 * 
 * 
 * Enter a number : 
10
0 , 2 , 4 , 6 , 8.



Enter a number : 
11
0 , 2 , 4 , 6 , 8 , 10.
 */
