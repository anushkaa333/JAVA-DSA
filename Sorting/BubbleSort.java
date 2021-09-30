package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	
	public static void bubble(int[] arr)
	{
		boolean swapped;
		for(int i=0; i < arr.length; i++)
		{
			swapped = false;
			for(int j=1; j < arr.length - i; j++)
			{
				if(arr[j] < arr[j-1])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}
			}
			if(!swapped)
			{
				break;
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
		
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}

}
