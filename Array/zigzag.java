package Array;

import java.util.Scanner;

public class zigzag {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int m = sc.nextInt();
		
		int arr[] = new int[m];
		for(int i=0; i < m; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		zig(arr);
	}
	
	public static void zig(int[] arr)
	{
		boolean flag = true;
		for(int i = 0 ; i < arr.length - 2 ; i++)
		{
			if(flag)
			{
				if(arr[i]>=arr[i+1])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp; 
				}
			}
			else
			{
				if(arr[i] < arr[i+1])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp; 
				}
			}
			flag = !flag;
		}
		
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
	}

}

/*
 * Enter array size
8


8
10
9
1
6
3
5
4


8 10 1 9 3 6 5 4 */
