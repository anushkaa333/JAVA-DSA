package Array;

import java.util.Scanner;

public class tech_pre {
	 ;
	public static int tech(char[] ch)
	{
		int count1 = 0;
		for(int i = 0 ; i < ch.length; i++ )
		{
			
			if(ch[i]==1 || ch[i]==2 || ch[i]==3 || ch[i]==5 || ch[i]==7)
				count1 = count1 + 0;
			
			if(ch[i]==0 || ch[i]==4 || ch[i]==6 || ch[i]==9)
				count1 = count1 + 1;
			
			if(ch[i] == 8)
				count1 = count1 + 8;
		}
		
		return count1;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*int m = sc.nextInt();
		String s = Integer.toString(m);
		char[] ch = s.toCharArray();*/
		
		String s = sc.next();
		char[] ch = s.toCharArray();
		int ans = tech(ch);
		
		System.out.println(ans);
	}

}
