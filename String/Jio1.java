package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jio1 
{

	public static void main(String[] args)
	{
//		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
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
		
		for(Map.Entry<Character, Integer> h : hm.entrySet())
		{
			if(h.getKey()!='a' || h.getKey()!='e' || h.getKey()!='i' || h.getKey()!='o' || h.getKey()!='u'  )
			{
				System.out.println(h.getKey() + " " + h.getValue());
			}
		}
		
		String str2 = str.replaceAll("[aeiou]", " ");
		
		System.out.println(str2);
		

	  }
	
	

}
