package Searching;

import java.util.Scanner;

public class Binary {

	public static int bi(int[] arr, int target)
	{
		int start =0;
		int end = arr.length - 1;
		boolean isAsc;
		if(arr[start] < arr[end])
		{
			isAsc = true;
		}
		else
		{
			isAsc = false;
		}
		
		
		while(start<=end)
		{
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target)
			{
				return mid;
			}
			if(isAsc)
			{
				if(target < arr[mid])
				{
					end = mid -1;
				}
				else
				{
					start = mid + 1;
				}
			}
			else
			{
				if(target > arr[mid])
				{
					end = mid -1;
				}
				else
				{
					start = mid + 1;
				}
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int m = sc.nextInt();
		int[] arr = new int[m];
		
		for(int i=0; i < arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target element : ");
		int target = sc.nextInt(); 
		
		int ans = bi(arr,target);
		System.out.println(ans);
	}

}
