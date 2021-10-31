package Number_System;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter a number : ");
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isOdd(n));
	}
	
	public static boolean isOdd(int n)
	{
		return (n & 1) ==1;
	}

}


/*

Enter a number : 
67
true
*/