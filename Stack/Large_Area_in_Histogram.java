package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Large_Area_in_Histogram
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
	
		int[] right = st_right(arr);
 		int[] left = st_left(arr);
 		
 		int maxsum = 0;
 		for(int j=0; j<arr.length;j++)
 		{
 			int curr = (right[j] - left[j] - 1)*arr[j];
 			maxsum = Math.max(maxsum, curr);
 		}
 		System.out.println(maxsum);
	}
	
	public static int[] st_left(int[] arr)
	{
		int[] left = new int[arr.length];
		Stack<Integer> s = new Stack<>();
		
		for(int i=0; i < arr.length; i++)
		{
			while(!s.isEmpty() && arr[s.peek()]>=arr[i])
			{
				s.pop();
			}
			if(s.isEmpty())
			{
				left[i] = -1;
			}
			else
			{
				left[i] = s.peek();
			}
			
			s.push(i);
		}
		for(int i : left)
		{
			System.out.print(i + " ");
		}
		System.out.println(left.toString());
		return left;
	}
	
	
	public static int[] st_right(int[] arr)
	{
		int[] right = new int[arr.length];
		Stack<Integer> s = new Stack<>();
		
		for(int i=arr.length-1; i >=0 ; i--)
		{
			while(!s.isEmpty() && arr[s.peek()]>=arr[i])
			{
				s.pop();
			}
			if(s.isEmpty())
			{
				right[i] = arr.length;
			}
			else
			{
				right[i] = s.peek();
			}
			
			s.push(i);
		}
		for(int i : right)
		{
			System.out.print(i + " ");
		}
		System.out.println(right.toString());
		return right;
	}
	
	
}
/*
 * 
 * 9
 
 
 
4
2
1
5
6
3
2
4
2


1 2 9 5 5 6 9 8 9 [I@7ba4f24f
-1 -1 -1 2 3 2 2 6 2 [I@3b9a45b3
12


*/