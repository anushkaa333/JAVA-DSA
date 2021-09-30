package Array;

import java.util.Scanner;

public class tcs {

	public static int tcs(int[] arr)
	{
		
		for(int i = 0; i < arr.length; i++)
		{
			int sum = arr[i];
			for(int j = i + 1; j < arr.length ; j++)
			{
				
				sum = sum + arr[j];
				if(sum == 0)
				{
					return 1;
				}
			}
			
			
			/*int sum;
			int sum1 = 0;
			if(arr[i]==0)
			{
				return 1;
			}
			
			else
			{	
					sum1 = sum1 + arr[i];
					if
			}*/
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] arr = new int[m];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int ans = tcs(arr);
		System.out.println(ans);
	}

}
