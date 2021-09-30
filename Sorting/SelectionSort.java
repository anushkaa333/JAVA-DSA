package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	//1 execution
	public static void selection(int[] arr)
	{
		for(int i=0; i < arr.length; i++)
		{
			//find the max element in the remaining array and swap it with correct index
			int last = arr.length - i -1;
			int maxIndex = getMaxIndex( arr, 0, last);
			swap(arr, maxIndex, last);
		}
	}
	
	
	//3 execution
	public static void swap(int[] arr, int first, int second)
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	//2 execution
	public static int getMaxIndex(int[] arr, int start, int last)
	{
		int max = start;
		for(int i = start; i < arr.length; i++)
		{
			if(arr[max] < arr[i])
			{
				max = i;
			}
		}
		return max;
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
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}

}
