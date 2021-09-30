package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Median {
	
	public static void median(int[] arr, int l)
	{
		int m = 0 ;
		if (l%2 == 1)
		{
			m = arr[(l+1)/2-1];
		}
		else
		{
			m=arr[l/2];
		}
		
		System.out.println("median is : " + m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.println("Enter number of rows : ");
		int m = sc.nextInt();
		System.out.println("Enter number of columns : ");
		int n = sc.nextInt();
		
		
		int[][] a=new int[m][n];
		System.out.println("Enter elements in matrix : ");
		for(i=0; i < m ; i++)
		    {
		        for(j=0; j < n ;j++)
		        {
		            a[i][j]=sc.nextInt();
		        }
		    }
		
		
		int k =0 ;
		int l = m*n;
		System.out.println("Array length will be : "+ l);
		int[] arr = new int[l];
		for(i=0; i < m ; i++)
	    {
	        for(j=0; j < n ;j++)
	        {
	            arr[k] =  a[i][j];
	            k++;
	        }
	    }
		
		Arrays.sort(arr);
		System.out.println("Sorted array: ");
		for(int ar : arr)
		{
			System.out.println(ar);
		}
		
		median(arr, l );
	}

}
