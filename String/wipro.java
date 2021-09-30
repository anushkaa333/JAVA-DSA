package String;

import java.util.HashMap;
//import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;


public class wipro
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		int count = 0;
		HashSet<Character> s = new HashSet<>();
		
		for(int i=0; i < str.length(); i++)
		{
			//s.add(str.charAt(i));
			if(!s.contains(str.charAt(i)));
			{
				count++;
			}
		}
		
		System.out.println("count" + " " + count);*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0; i < str.length(); i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			}
			else
			{
				hm.put(str.charAt(i), 1);
			}
		}
		
		int count =0;
		for(Map.Entry<Character, Integer> h : hm.entrySet())
		{
			if(h.getValue() == 1)
			{
				count++;
			}
		}
		
		System.out.println("count " + count);
		
	}

}
/*
Enter string
anushka
count 5*/