package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Kadane_Algo {

	public static int kadane(int arr[])
	{
		int curr_sum = 0;
		int max_sum = Integer.MIN_VALUE;
		for(int i=0; i < arr.length; i++)
		{
			curr_sum = curr_sum + arr[i];
			max_sum = Math.max(max_sum, curr_sum);
			if(curr_sum < 0)
			{
				curr_sum = 0;
			}
		}
		return max_sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int m = sc.nextInt();
		
		int arr[] = new int[m];
		for(int i=0; i < m; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int result = kadane(arr);
		
			System.out.println("Max sum of sub arrays : " + result);
		
	}

}
