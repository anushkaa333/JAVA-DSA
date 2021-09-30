package Array;

import java.util.Scanner;

public class Wipro1 {
	public static int wipro(int[] arr)
	{
		int count =0;
		for(int i=0; i < arr.length; i++)
		{
			if(arr[i] > 0)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		
		int[] arr = new int[m];
		for(int i=0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int ans = wipro(arr);
		System.out.println(ans);
		
		
			}

}
