package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Max_rectangle_in_matrix_all1s {

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
		
		mat(Mat);
	}
	
	public static void mat(int[][] Mat)
	{
		int[] curRow = Mat[0];
		int maxArea = maxHistogram(curRow);
		
		
		for (int i=1; i < Mat.length; i++)
		{
			for (int j=0; j < Mat[0].length ; j++)
			{
				if (Mat[i][j] == 1)
				{
					curRow[j] += 1;
				}
				else
					curRow[j] = 0 ;
			}
			int curAns = maxHistogram(curRow);
			maxArea = Math.max(maxArea, curAns);
		}
		
		System.out.println(maxArea); 
		
	}
	
	public static int maxHistogram(int[] curRow)
	{
		int[] right = st_right(curRow);
 		int[] left = st_left(curRow);
 		
 		int maxsum = 0;
 		for(int j=0; j<curRow.length;j++)
 		{
 			int curr = (right[j] - left[j] - 1)*curRow[j];
 			maxsum = Math.max(maxsum, curr);
 		}
 		return maxsum;
	}
	
	public static int[] st_left(int[] curRow)
	{
		int[] left = new int[curRow.length];
		Stack<Integer> s = new Stack<>();
		
		for(int i=0; i < curRow.length; i++)
		{
			while(!s.isEmpty() && curRow[s.peek()]>=curRow[i])
			{
				s.pop();
			}
			if(s.isEmpty())
			{
				left[i] = -1;
			}
			else
			{
				left[i] = s.peek();
			}
			
			s.push(i);
		}
		for(int i : left)
		{
			System.out.print(i + " ");
		}
		System.out.println(left.toString());
		return left;
	}
	
	public static int[] st_right(int[] curRow)
	{
		int[] right = new int[curRow.length];
		Stack<Integer> s = new Stack<>();
		
		for(int i=curRow.length-1; i >=0 ; i--)
		{
			while(!s.isEmpty() && curRow[s.peek()]>=curRow[i])
			{
				s.pop();
			}
			if(s.isEmpty())
			{
				right[i] = curRow.length;
			}
			else
			{
				right[i] = s.peek();
			}
			
			s.push(i);
		}
		for(int i : right)
		{
			System.out.print(i + " ");
		}
		System.out.println(right.toString());
		return right;
	}
	

}

/*
 * Enter size of matrix:
4
6
Enter matrix elements:
0
1
1
1
1
0
 
1
1
1
1
0
1
 
1
1
0
1
1
1
 
1
1
1
1
1
0
 
Matrix is
0 1 1 1 1 0  
1 1 1 1 0 1  
1 1 0 1 1 1  
1 1 1 1 1 0  
6 5 5 5 5 6 [I@7ba4f24f
-1 0 0 0 0 -1 [I@3b9a45b3
4 4 4 4 6 6 [I@7699a589
-1 0 0 0 -1 4 [I@58372a00
2 2 6 4 6 6 [I@4dd8dc3
-1 0 -1 2 2 4 [I@6d03e736
2 2 5 4 5 6 [I@568db2f2
-1 0 -1 2 2 -1 [I@378bf509
6*/
