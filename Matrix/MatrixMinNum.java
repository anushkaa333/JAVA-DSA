package Matrix;

import java.util.Scanner;




public class MatrixMinNum
{
	
	public static void display(int result1[], int m)
	{
		for(int i = 0; i < m ; i++)
		{
			System.out.print(result1[i] + " ");
		}
	}
	
	public static void mat(int Mat[][], int m , int n)
	{
		int min = Integer.MAX_VALUE;
		int i, j;
		
		int[] result1 = new int[m];
		for(i = 0; i < m; i++)
		{
			for(j=0; j < n ; j++)
			{
				if(Mat[i][j] < min)
				{
					min = Mat[i][j];
				}
			}
			result1[i] = min;
			min = Integer.MAX_VALUE;
		}
		
		display(result1,m);
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter size of matrix:");
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[][] Mat = new int[m][n];
			
			System.out.println("Enter matrix elements:");
			for (int i=0; i < m; i++)
			{
				for (int j=0; j < n; j++)
				{
					Mat[i][j] = sc.nextInt();
				}
				System.out.println(" ");
			}
			
			
			System.out.println("Matrix is");
			for (int i=0; i < m; i++)
				{
					for (int j=0; j < n; j++)
					{
						System.out.print(Mat[i][j] + " ");
					}
					System.out.println(" ");
				}
			
			mat(Mat, m ,n);
			
			
			sc.close();
			
			
			
	}

}