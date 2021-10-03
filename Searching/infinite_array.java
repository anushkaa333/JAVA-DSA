package Searching;

import java.util.Scanner;

//Position of element in an infinite sorted array
public class infinite_array 
{
	
	public static int ans(int[] arr, int target)
	{
		int start = 0; 
		int end = 1;
		
		while(target > arr[end])
		{
			int newStart = end + 1;
			end = end + (end - start + 1)*2;
			start = newStart;
		}
		return bi(arr, target, start, end);
	}
	
	public static int bi(int[] arr, int target, int start, int end)
	{
		
		while(start<=end)
		{
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target)
			{
				return mid;
			}
			
				if(target < arr[mid])
				{
					end = mid -1;
				}
				else
				{
					start = mid + 1;
				}
			
			
		}
		return -1;
	}


	public static void main(String[] args) 
	{
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
		
		int anss = ans(arr,target);
		System.out.println(anss);

	}

}
