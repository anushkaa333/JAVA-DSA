package Matrix;

import java.io.*;
import java.util.Scanner;

public class spiral_traversal
{

	public static void main(String[] args)
	{
	
			Scanner sc =new Scanner(System.in);
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
			
			
			    int r1=0,r2=m-1;
			    int c1=0,c2=n-1;
			    while(r1<=r2 && c1<=c2)
			    {
			        for(j=c1;j<=c2;j++)
			        System.out.print(a[r1][j]+" ");
			       r1++;
			       
			        for(i=r1;i<=r2;i++)
			        System.out.print(a[i][c2]+" ");
			       c2--;
			       
			        for(j=c2;j>=c1;j--)
			        System.out.print(a[r2][j]+" ");
			       r2--;
			       
			        for(i=r2;i>=r1;i--)
			        System.out.print(a[i][c1]+" ");
			       c1++;
			    }
			    System.out.println();
		}
}
		




































