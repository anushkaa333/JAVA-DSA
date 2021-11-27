package Recursion2;

import java.util.Scanner;

public class Rotated_BinarySearch {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] arr = new int[m];
		for(int i=0; i < arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(bin(arr, target, 0, arr.length-1));
		
	}
	
	public static int bin(int[] arr, int target, int s, int e)
	{
		int mid = s + (e-s)/2;
		
		if(s>e)
		{
			return -1;
		}
		
		if(arr[mid] == target)
		{
			return mid;
		}
		
		if(arr[s] <= arr[mid])
		{
			if(target>=arr[s] && target<=arr[mid])
			{
				return bin(arr, target, s, mid-1);
			}
			else
			{
				return bin(arr, target, mid+1, e);
			}
		}
		
		
		if(target>=arr[mid] && target<=arr[e])
		{
			return bin(arr, target, mid+1, e);
		}
		return bin(arr, target, s, mid-1);
	}

}


/*
(1)
5
1
2
3
4
5

3

2

(2)

5
1
2
3
4
5

6

-1

*/