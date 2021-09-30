package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicate_elements {
	public static void duplicate(int arr[], int m)
	{
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i < arr.length; i++)
		{
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i], hm.get(arr[i]) + 1);
			}
			else
			{
				hm.put(arr[i], 1);
			}
		}
		
		for( Map.Entry <Integer, Integer> h : hm.entrySet())
		{
			if(h.getValue()>1)
			{
				System.out.println("Key : " + h.getKey() + " Value : " + h.getValue());
			}
		}
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int m = sc.nextInt();
		
		int arr[] = new int[m];
		for(int i=0; i < m; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		duplicate(arr, m);
	}

}

/*
 * Enter array size
5
3
3
2
5
4
Key : 3 Value : 2*/
