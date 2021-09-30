package Array;

import java.util.Scanner;
import java.util.*;

public class Reverse_Array {
	
	public static void display(int arr1[], int m)
	{
		for(int i=0; i < m; i++)
		{
			System.out.println(  arr1[i] + " ");
		}
	}
	
	public static void reverseArray(int arr[], int m)
	{
		int j=0;
		int arr1[] = new int[m];
		for (int i= m -1 ; i >= 0; i--)
		{
			arr1[j] = arr[i];
			j++;
		}
		display(arr1 , m);
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
		
		for(int i=0; i < m; i++)
		{
			System.out.print( arr[i] + " ");
		}
		
		/*for (int k : arr)
		{
			System.out.print(k + " ");
		}*/
		
		reverseArray(arr, m);
	}

}
