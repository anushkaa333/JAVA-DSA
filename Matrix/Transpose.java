package Matrix;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0; j<mat[0].length;j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		
		display(mat);
		transpose(mat, m, n);
	}
	
	public static void display(int[][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0; j<mat[0].length;j++)
			{
				System.out.print(mat[i][j] + " ");
				
			}
			System.out.println();
		}
	}
		
	
		public static void transpose(int[][] mat, int m ,int n)
		{
		
			int[][] mat1 = new int[n][m];
			for(int i=0;i<mat.length;i++)
			{
				for(int j=0; j<mat[0].length;j++)
				{
					
					mat1[j][i] = mat[i][j];
					
				}
				System.out.println();
			}
			transpose_display(mat1);
		}
		
		public static void transpose_display(int[][] mat1)
		{
			for(int i=0;i<mat1.length;i++)
			{
				for(int j=0; j<mat1[0].length;j++)
				{
					
					System.out.print(mat1[i][j] + " ");
					
				}
				System.out.println();
			}
		}
		

}
