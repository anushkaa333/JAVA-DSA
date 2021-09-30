import java.util.Scanner;
import java.util.*;

public class Binry_bits {

	public static void Binry(int arr[], int m, int days)
	{
		int i, k;
		int temp[] = new int[m];
		int arr1[] = new int[m];
		int start=0,end=0;
		for( k=1; k<=days; k++)
		{
			
			
			for( i=0; i < arr.length ; i++)
			{
				
				if(i==0)
				{
					if(arr[i+1]!=start)
					{
						arr1[i]=1;
					}
					else 
					{
						arr1[i]=0;
					}
				}
				else if(i== arr.length-1)
				{
					if(arr[i-1]!=end)
					{
						arr1[i]=1;
					}
					else
					{
						arr1[i]=0;
					}
				}
			else if(arr[i+1]==arr[i-1] )
					{
						arr1[i] = 0;
					}
				
				
				else 
				{
					arr1[i] = 1;
				}
				
				
			
			
			
		    }
			
			for( i=0; i < arr1.length ; i++)
			{
				arr[i] = arr1[i];
			}
			
		}
		
	
		System.out.println("Output");
		for(int i1: arr1)
		{
			System.out.println( arr1[i1]);
		}
		
		
		/*System.out.print("Value on"+ k + "day :");
		for(int i1: arr1)
		{
			System.out.println(i1 );
		}
		
		
		
		for(i = 0 ; i < arr1.length; i++)
		{
			arr[i] = arr1[i];
		}*/
		
		/*System.out.println("Array for "+ k + " day ");
		for(int i1=0; i1 < arr1.length ; i1++)
		{
			System.out.print( arr1[i1] + " ");
		}
		
		int arr[] = Arrays.copyOf(arr1, arr1.length);*/
		/*display(a)*/
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int m = sc.nextInt();
		
		int[] arr = new int[m];
		for(int i=0; i < m ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter days:");
		int days = sc.nextInt();
		Binry(arr, m,  days);
		sc.close();
	}

}

/* for(i=0,j=0; i<arr1.length, j<arr2.length; i++,j++){*/



