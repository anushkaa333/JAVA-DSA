package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Row_with_max_1s {
	
	public static int display(int arr[], int max , int m)
	{
	
		int k = 0;
		for(int i=0; i < m; i++)
		{
			if(arr[i] == max)
			{
				k=i;
			}
		}
		return k;
				
			
		}	
	
	public static void max(int arr[], int m)
	{
		int i = 0;
		int max = arr[i];
		for(i=1;i<m;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("Max is : " + max  /*+ " from row " + Arrays.asList(arr).indexOf(max)*/);
		int d = display(arr, max, m);
		System.out.println("Maximum is from " + d  + " row");
	}

	public static void ffind(int a[][], int m, int n)
	{
		int arr[] = new int[m];
		int i,j, k=0;
		int count = 0 ;
		for(i=0; i < m ; i++)
	    {
	        for(j=0; j < n ;j++)
	        {
	            if(a[i][j] == 1)
	            {
	            	
	            	count ++;
	            }
	        }
	        arr[k] = count;
	        k++;
	        count = 0;
	    }
		
		System.out.print("Number of 1s from each row : ");
		for (int y : arr)
		{
			System.out.print(/*"Number of 1s from each row : " +*/ y + " ");
		}
		System.out.println(" ");
		max(arr, m);
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
		
		ffind(a, m, n);
	}

}
