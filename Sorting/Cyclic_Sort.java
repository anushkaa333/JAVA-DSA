package Sorting;

import java.util.Arrays;
import java.util.Scanner;
// When array is 1 to N
public class Cyclic_Sort {

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
		
		cyclic(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void cyclic(int[] arr)
	{
		int i = 0;
		while (i < arr.length)
		{
			int correct = arr[i] - 1;
			if(arr[i] != arr[correct])
			{
				int temp = arr[correct];
				arr[correct] = arr[i];
				arr[i] = temp;
			}
			else
			{
				i++;
			}
		}
	}

}
/*
 * 5
3
2
1
4
5
[1, 2, 3, 4, 5]*/
