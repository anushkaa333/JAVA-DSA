package Recursion4;

import java.util.Scanner;

public class Addn {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0; i  < arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println(add(arr, size));
	}
	
	public static int add(int[] arr, int size)
	{
		
		
		if(size <= 0)
		{
			return 0;
		}
		return (arr[size-1] + add(arr, size-1));
		
		
			
		
		
		
	}

}
