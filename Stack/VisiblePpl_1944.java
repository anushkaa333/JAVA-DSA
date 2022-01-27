package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class VisiblePpl_1944 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] arr = new int[m];
		for(int i=0; i < m ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print(Arrays.toString(vp(arr)));
	}

	
	public static int[] vp(int[] arr)
	{
		
		int[] count = new int[arr.length];
		//Arrays.fill(arr, 0); .... no need to initialize array with 0 otherwise array output will contain 1 at every index
		Stack<Integer> s = new Stack<Integer>();
		for(int i=arr.length-1; i >= 0 ; i--)
		{
			if(s.isEmpty())
			{
				count[i] = 0;
			}
			if(!s.isEmpty() && arr[i] < s.peek())
			{
				count[i]++;
			}
			if(!s.isEmpty() && arr[i]>=s.peek())
			{
				while(!s.isEmpty() && arr[i]>=s.peek())
				{
					s.pop();
					count[i]++;
				}
				if(!s.isEmpty() && arr[i]<s.peek())
				{
					count[i]++;
				}
				if(s.isEmpty())
				{
					count[i] = count[i] + 0;
				}
			
			}
			
			s.push(arr[i]);
		}
		
		return count;
	}
}

/*
 * 6


10
6
8
5
11
9


[3, 1, 2, 1, 1, 0]*/
