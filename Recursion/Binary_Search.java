package Recursion;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int m = sc.nextInt();
		int[] arr = new int[m];
		for(int i=0; i < m; i++)
		{
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		
		int ans = search(arr, 0, arr[arr.length-1], target);
		System.out.println(ans);
	}
	
	public static int search(int[] arr, int s, int e, int t) 
	{
		if(s>e)
		{
			return -1;
		}
		
		int mid = s + (e-s)/2;
		
		if(t==arr[mid])
		{
			return mid;
		}
		
		if(t < arr[mid])
		{
			//e = mid -1;
			return search(arr, s, mid-1, t );
		}
		return search(arr, mid+1, e, t);
		
	}

}
