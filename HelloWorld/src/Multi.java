import java.util.*;

public class Multi
{

	public static void multi(int arr[])
	{
		/*int arr1[] = new int[2];*/
		/*System.out.println("Sorted array : ");*/
 		Arrays.sort(arr);
 		/*System.out.print(arr);*/
		int i = 0;
		int max1 = arr[i] * arr[i+1];
		int max2 = arr[arr.length - 2] * arr[arr.length - 1];
		
		if(max1 > max2)
		{
			System.out.println("2 numbers are : " + arr[i] + " and  " +  arr[i+1]);
		}
		else
		{
			System.out.println("2 numbers are : " + arr[arr.length - 2] + " and " + arr[ arr.length - 1]);
		}
		
	/*	return arr1;*/
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size:");
		int m = sc.nextInt();

		int arr[] = new int[m];

		System.out.println("Enter numbers:");
		for(int i=0; i < m; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		multi(arr);
		
		sc.close();
	}

}
