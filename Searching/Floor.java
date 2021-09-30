package Searching;

import java.util.Scanner;

public class Floor {

	public static int Fl(int[] arr, int target)
	{
		int start = 0;
		int end = arr.length - 1;
		
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
	
		
		
		return end;
		
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
		
		int ans = Fl(arr,target);
		System.out.println(ans);
	}

}
