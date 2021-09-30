package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Sorted_matrix {
	
	
	public static void array_to_mat(int[] arr, int m, int n, int p)
	{
		int i,j;
		int count = 0;
		int a1[][] = new int[m][n];
 		for(i=0; i < m ; i++)
	    {
	        for(j=0; j < n ;j++)
	        {
	            a1[i][j] = arr[count];
	            count++;
	        }
	    }
 		
 		System.out.println("Sorted matrix : "); 
 		for(i=0; i < m ; i++)
	    {
	        for(j=0; j < n ;j++)
	        {
	            System.out.print(a1[i][j] + " ");
	        }
	        System.out.println( " ");
	    }
		
		
	}

	public static void mat_to_array(int[][] a, int m, int n) 
	{
		int i,j, q=0;
		int p = m*n;
		int[] arr = new int[p];
		for(i=0; i < m ; i++)
	    {
	        for(j=0; j < n ;j++)
	        {
	           arr[q] = a[i][j];
	           q++;
	        }
	    }
		
		Arrays.sort(arr);
		for(int k : arr)
		{
			System.out.println(k);
		}
		
		array_to_mat(arr, m, n, p);
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
		
		mat_to_array(a, m, n);
		
		
	}

}


/*Enter number of rows : 
3
Enter number of columns : 
3
Enter elements in matrix : 
1
5
3
2
8
7
4
6
9
Sorted list : [1, 5, 3, 2, 8, 7, 4, 6, 9]
Sorted matrix : 
1 2 3  
4 5 6  
7 8 9*/
