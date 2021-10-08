package Recursion;

import java.util.Scanner;

public class fibonacci 
{

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 0 ;
		int b = 1;
		int c;
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i < num; i++)
		{
			System.out.print(a);
			c = a+b;
			a=b;
			b=c;
			if(i==num - 1)
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

/*
 7
0 , 1 , 1 , 2 , 3 , 5 , 8.

5
0 , 1 , 1 , 2 , 3.
*/
