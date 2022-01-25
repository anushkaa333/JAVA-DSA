package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stock_span 
{

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
		int[] newarr = new int[arr.length];
		st(arr, newarr);
		st_usingArray(arr, newarr);
	}
	
	public static void st(int[] arr, int[] newarr )
	{
		Stack<Integer> s = new Stack<>();
		s.push(0);
		
		newarr[0] = 1;
		for(int i=1; i<arr.length ; i++)
		{
			while(!s.isEmpty() && arr[s.peek()] <= arr[i])
			{
				s.pop();
			}
			
			newarr[i] = (s.isEmpty()) ? (i+1) : (i-s.peek());
			s.push(i);
			
		}
		System.out.println(Arrays.toString(newarr));
	}
	
	public static void st_usingArray(int[] arr, int[] newarr)
	{
		for(int i=0; i < arr.length ; i++ )
		{
			newarr[i]=1;
			for(int j=i-1; (j>=0) && (arr[j]<= arr[i]) ; j--)
			{
				newarr[i]+=1;
			}
		}
		System.out.println(Arrays.toString(newarr));
	}
}

/*
 * 6
 
 
100
60
70
65
80
85


[1, 1, 2, 1, 4, 5]


6

31
27
14
21
30
22

[1, 1, 1, 2, 4, 1]
*/
