package Matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorted_matrix_with_arraylist {
	
	public static void list_to_mat(ArrayList<Integer> arrlist, int m, int n, int a[][])
	{
		/*Integer[] a1 = {};
		a1 = arrlist.toArray(a1);
		
		for(int c : a1)
		{
			System.out.println(c);
		}*/
		
		int i,j, r=0;
		int a1[][] = new int [m][n];
 		for(i=0; i < m ; i++)
	    {
	        for(j=0; j < n ;j++)
	        {
	            a1[i][j] = arrlist.get(r);
	            r++;
	        }
	    }
 		
 		
 		System.out.println("Sorted matrix : ");
 		for(i=0; i < m ; i++)
	    {
	        for(j=0; j < n ;j++)
	        {
	        	System.out.print(a1[i][j]+ " ");
	        }
	        System.out.println(" ");
	    }
 		
 		
 		
		
	}
	
	public static void mat_to_array(int[][] a, int m, int n)
	{
		int i,j;
		ArrayList<Integer> arrlist = new ArrayList<>();
		for(i=0; i < m ; i++)
	    {
	        for(j=0; j < n ;j++)
	        {
	            arrlist.add(a[i][j]);
	        }
	    }
		
		System.out.println("Sorted list : " + arrlist);
		Collections.sort(arrlist);
		
		list_to_mat(arrlist, m, n, a);
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
