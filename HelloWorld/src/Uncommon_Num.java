import java.util.Scanner;
/*import java.util.*;*/

public class Uncommon_Num 
{
	
	public static int uncom(int arr1[], int arr2[])
	{
		int count = 0;
		for(int i=0; i < arr1.length ; i++)
		{
			for(int j=0; j < arr2.length ; j++)
			{
				if(arr1[i]!=arr2[j])
				{
					continue;
				}
				else
				{
					count++;
					
				}
				
			}
		}
		return count;
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of 1st array");
		int m = sc.nextInt();
		int arr1[] = new int[m];
		System.out.println("Enter array elements : ");
		for(int i=0; i < m; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		/*for(int i=0; i < m; i++)
		{
			System.out.println(arr1[i] + " ");
		}*/
		
		
		
		System.out.println("Enter size of 2nd array");
		int n = sc.nextInt();
		int arr2[] = new int[n];
		System.out.println("Enter array elements : ");
		for(int j=0; j < n; j++)
		{
			arr2[j] = sc.nextInt();
		}
		
		/*for(int k : arr2)
		{
			System.out.print(k);
		}*/
		int result = uncom(arr1, arr2);
		System.out.println(result);
		
	}

}
