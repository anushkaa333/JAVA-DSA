package Number_System;

import java.util.Scanner;

public class Even_3 {

	
	/*public static int e4(int num)
	{
		
	}*/
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		int num = sc.nextInt();
		//int ans = e4(num);
		//System.out.println(ans);
		
		int count = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		while(b!=num)
		{
			c = a + b;
			a = c;
			b = b + 2;
			count++;
		}
		
		System.out.println(count+1);
	}

}
