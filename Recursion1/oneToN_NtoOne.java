package Recursion1;

import java.util.Scanner;

public class oneToN_NtoOne {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("N to 1 :");
		NtoOne(num);
		System.out.println("1 to N :");
		onetoN(num);
	}
	
	public static void NtoOne(int num)
	{
		if(num==0)
		{
			return;
		}
		System.out.println(num);
		NtoOne(num -1);
	}

	
	public static void onetoN(int num)
	{
		if(num==0)
		{
			return;
		}
		onetoN(num-1);
		System.out.println(num);
	}

}

/*
 * 
 * 5
N to 1 :
5
4
3
2
1
1 to N :
1
2
3
4
5
*/
