package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] arr = new int[m];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int[] ans = mergeSort(arr); // arr = mergeSort(arr);
		System.out.println(Arrays.toString(ans)); // System.out.println(Arrays.toString(arr));
	}
	
	public static int[] mergeSort(int[] arr)
	{
		if(arr.length == 1)
		{
			return arr;
		}
		
		int mid = arr.length/2;
		
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left, right);
		
	}
	
	
	public static int[] merge(int[] left, int[] right)
	{
		int[] mix = new int[left.length + right.length];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < left.length && j < right.length)
		{
			if(left[i] < right[j])
			{
				mix[k] = left[i];
				i++;
			}
			else
			{
				mix[k] = right[j];
				j++;
			}
			k++;
		}
		
		
		while(i < left.length)
		{
			mix[k] = left[i];
			k++;
			i++;
		}
		
		
		while(j < right.length)
		{
			mix[k] = right[j];
			k++;
			j++;
		}
		
		return mix;
		
	}
	
	
	

}

/*
 5
 
 
1
4
2
5
3
[1, 2, 3, 4, 5]
*/