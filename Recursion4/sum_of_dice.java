package Recursion4;

import java.util.ArrayList;
import java.util.Scanner;

public class sum_of_dice {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		sum("", target);
		System.out.println(sumRet("", target));
	}
	
	public static void sum(String str, int target)
	{
		if(target == 0)
		{
			System.out.println(str);
			return;
		}
			for(int i = 1; i <=6 && i <= target ; i++ )
			{
				sum(str + i, target-i);
			}
	}
	
	public static ArrayList<String> sumRet(String str, int target)
	{
		if(target == 0)
		{
			ArrayList<String> list = new ArrayList<String>();
			list.add(str);
			return list;
		}
		
		ArrayList<String> list = new ArrayList<String>();
			for(int i = 1; i <=6 && i <= target ; i++ )
			{
				list.addAll(sumRet(str + i, target-i));
			}
			return list;
	}

}

/*
 * 4
 * 
1111
112
121
13
211
22
31
4




5


11111
1112
1121
113
1211
122
131
14
2111
212
221
23
311
32
41
5
[11111, 1112, 1121, 113, 1211, 122, 131, 14, 2111, 212, 221, 23, 311, 32, 41, 5]
*/