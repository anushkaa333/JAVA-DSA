package Stack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class NGL {

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
		ngl(arr);
	}
	
	public static void ngl(int[] arr)
	{
		Vector<Integer> v = new Vector<>();
		Stack<Integer> s = new Stack<>();
		for(int i=0 ; i < arr.length ; i++)
		{
			if(s.isEmpty())
			{
				v.add(-1);
				
			}
			
			if(s.size()>0 && arr[i] < s.peek())
			{
				v.add(s.peek());
				
			}
			
			if(s.size()>0 && arr[i] > s.peek())
			{
				while(s.size()>0 && arr[i] >= s.peek())
				{
					s.pop();
				}
				
				if(s.size() == 0)
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
 * 4


1
3
2
4


-1 
-1 
3 
-1 
*/