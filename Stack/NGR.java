package Stack;

//Nearest greater to right

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class NGR {

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
		ngr(arr);
	}
	
	public static void ngr(int[] arr)
	{
		Vector<Integer> v = new Vector<>();
		Stack<Integer> s = new Stack<>();
		for(int i=arr.length -1; i >=0; i--)
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
		
		/*Iterator<Integer> itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next() + " ");
		}*/
		
		for(int i=v.size() -1 ; i>=0 ; i--)
		{
			System.out.println(v.get(i) + " ");
		}
		
	}

}

/*
4

1
3
2
4

3 
4 
4 
-1 
*/