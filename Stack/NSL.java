package Stack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

//Nearest smaller to left
public class NSL {

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
		nsl(arr);
	}
	
	public static void nsl(int[] arr)
	{
		Stack<Integer> s = new Stack<>();
		Vector<Integer> v = new Vector<>();
		for(int i=0; i< arr.length; i++)
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
		
		Iterator<Integer> itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next() + " ");
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

-1 
4 
-1 
2 
2 */
