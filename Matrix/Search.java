package Matrix;

import java.util.Scanner;

public class Search {
	
	    
	    public static boolean searchMatrix(int[][] a, int target) 
	    {
	        for(int i=0; i < a.length; i++)
	        {
	            
	            for(int j=0; j < a[0].length; j++)
	            {
	                
	                if(a[i][j] == target) 
	                {
	                    return true;
	                }else if(a[i][j] > target)
	                {
	                    return false;
	                }
	                
	            }
	        }
        return false;
	    }
	


	public static void main(String[] args)
	{
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
		
		System.out.println("Enter elements you want to search:");
		int target = sc.nextInt();
		boolean b = searchMatrix(a, target);
		System.out.println(b);
	}

}





/*class Solution {
    public boolean searchMatrix(int[][] m, int t) {

        int i =0 ,j =  m[0].length-1;
         while (i < m.length && j >= 0) {
		// if m[i][j] == target then we simply return true
                    if (m[i][j] == t) {
                        return true;
                    } 
					// now we check we m[i][j] is greater then target then we shift your column pointer(j) by one in left directiom
					else if (m[i][j] > t) {
                        j--;
                    } 
					// else we check in next row 
					else {
                        i++;
                    }
         }
        return false;
    }
}*/
