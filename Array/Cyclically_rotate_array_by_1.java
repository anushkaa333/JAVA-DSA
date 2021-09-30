package Array;

import java.util.Scanner;

public class Cyclically_rotate_array_by_1 {

	public static void rotate(int[] arr)
	{
		int last = arr[arr.length - 1];
		for(int i= arr.length - 2; i >= 0; i--)
		{
			arr[i+1] = arr[i];
		}
		arr[0] = last;
		
		for(int j : arr)
		{
			System.out.println(j);
		}
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
		
		rotate(arr);
	}

}
