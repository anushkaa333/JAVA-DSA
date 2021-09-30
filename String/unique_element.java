package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class unique_element
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count =0;
		String[] str1 = str.split(" ");
		for(int i=0; i < str1.length; i++)
		{
			String str2 = str1[i];
			for(int j = 0; j < str1.length ; j++)
			{
				boolean flag = true;
				if(str2.equals(str1[j]))
				{
					flag = false;
				}
				if(flag)
				{
					count++;
				}
			}
			
		}
		System.out.println(count);*/
		
		
		Scanner sc = new Scanner(System.in);
		String str = "ab ab bc cd   ";//sc.next();
		String[] s1 = str.split(" ");
		for(String s : s1 )
		{
			System.out.print(s + " ");
		}
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(int i=0; i < s1.length; i++)
		{
			if(hm.containsKey(s1[i]))
			{
				hm.put(s1[i], hm.get(s1[i]) + 1);
			}
			else
			{
				hm.put(s1[i], 1);
			}
			
		}
		 //for loop in other way
		/*for(String s : str1)
		{
			if(hm.containsKey(s))
			{
				hm.put(s, hm.get(s) + 1);
			}
			else
			{
				hm.put(s, 1);
			}
			
		}*/
		
		int count = 0 ;
		for(Map.Entry<String, Integer> h : hm.entrySet())
		{
			if(h.getValue()==1)
			{
				count++;
				
				//System.out.println(h.getKey());
			}
		}
		System.out.println(count);
	}

}
