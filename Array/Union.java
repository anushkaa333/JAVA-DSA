package Array;

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class Union 
{
	public static void main (String[] args)
	{
	    
	    //Taking input using class Scanner
		Scanner sc=new Scanner(System.in);
		
		//Taking total count of testcases
		/*int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{*/
		    
		    int n,m;
		    
		    //taking size of array a 
		    System.out.println("Enter size of 1st array : ");
		    n=sc.nextInt();
		    
		    //taking size of array b
		    System.out.println("Enter size of 2nd array : ");
		    m=sc.nextInt();
		    
		    //Creating 2 array of size n and m
		    int a[]=new int[n];
		    int b[]=new int[m];
		    
		    
		    //inserting elements to array a
		    System.out.println("Elements in 1st array : ");
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		    //inserting elements to array b
		    System.out.println("Elements in 2nd array : ");
		    for(int i=0;i<m;i++)
		    {
		        b[i]=sc.nextInt();
		    }
		    
		    //calling doUnion method and printing the results
		    System.out.println(doUnion(a,n,b,m));
		}
		
	



	public static int doUnion(int a[], int n, int b[], int m) 
	{
	  
	  
	  Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	  for(int i=0;i<n;i++)
	  {
	      map.put(a[i],map.getOrDefault(a[i],0)+1);
	  }
	  
	  for(int i=0;i<m;i++)
	  {
	    map.put(b[i],map.getOrDefault(b[i],0)+1);  
	  }
	  
	  /*System.out.println("Hashing");
	  for(Map.Entry<Integer, Integer> y : map.entrySet())
	  {
		  System.out.println(y.getKey() + " " + y.getValue());
	  }*/
	  
	  System.out.println(map);
	  return map.size();
	  
	  
	}

}  