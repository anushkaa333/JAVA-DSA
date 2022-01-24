package Stack;

//Nearest smaller to right

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class NSR {

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
		nsr(arr);
	}

	public static void nsr(int[] arr)
	{
		Stack<Integer> s = new Stack<>();
		Vector<Integer> v = new Vector<>();
		for(int i=arr.length-1; i>=0 ; i--)
		{
			if(s.isEmpty())
			{
				v.add(-1);
			}
			
			if(s.size()>0 && arr[i]>s.peek())
			{
				v.add(s.peek());
			}
			
			if(s.size()>0 && arr[i]<=s.peek())
			{
				while(s.size()>0 && arr[i]<=s.peek())
				{
					s.pop();
				}
				if(s.size()==0)
				{
					v.add(-1);
				}
				else
					v.add(s.peek());
				
			}
			
			s.push(arr[i]);
		}
		for(int i=v.size() -1 ; i>=0 ; i--)
		{
			System.out.println(v.get(i) + " ");
		}
	}
}
/*
5


4
5
2
10
8


2 
2 
-1 
8 
-1 
*/
