package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void insert(int[] arr)
	{
		for(int i=0; i < arr.length - 1; i++)
		{
			for(int j=i+1; j > 0; j--)
			{
				if(arr[j] < arr[j-1])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] arr = new int[m];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		insert(arr);
		System.out.println(Arrays.toString(arr));

	}

}
