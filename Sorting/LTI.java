package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class LTI {
	
	static int s = 0;
	
	public static int lti(int num, int[] arr)
	{
		
		
		for(int j=0; j < arr.length - 1; j++ )
		{
			if(arr[j] > arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				
				int sub = arr[j+1] - arr[j];
				s = s + sub;
			}
		}
		
		/*while(Arrays.sort(arr) == false)
		{
			
		}*/
		
		
		for(int k=0; k < arr.length - 1; k++ )
		{
			if(arr[k] > arr[k+1])
			{
				
				lti(num, arr);
				/*int temp = arr[k];
				arr[k] = arr[k+1];
				arr[k+1] = temp;
				
				int sub = arr[j] - arr[j+1];
				s = s + sub;*/
			}
		}
		
		
		return s;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input numbers count:");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int ans = lti(num, arr);
		System.out.println(ans);
	}

}
