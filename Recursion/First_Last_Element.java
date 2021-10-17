package Recursion;

import java.util.Scanner;

public class First_Last_Element 
{
	public static int first = -1;
	public static int last = -1;
    public static void rev(String str, int index, char ch)
    {
    	if(index == str.length())
    	{
    		System.out.println(first);
    		System.out.println(last);
    		return ;
    	}
    	
    	char chh = str.charAt(index);
    	if(chh == ch)
    	{
    		if(first == -1)
    		{
    			first = index;
    		}
    		else
    		{ 
    			last = index;
    		}
    	}
    	
    	rev(str, index + 1, ch);
    }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch = sc.next().charAt(0);
		rev(str, 0 , ch);
	}

}

/*

ddsasi
s
2
4
*/
