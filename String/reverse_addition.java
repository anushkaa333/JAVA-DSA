package String;

import java.util.Scanner;

public class reverse_addition 
{
//	public static int add(char[] rr1, char[] rr2)
//	{
//		int add = 0;
//		if(rr1.length > rr2.length)
//		{
//			char[] arr = new char[rr1.length + 1];
//		}
//		else
//		{
//			char[] arr = new char[rr2.length + 1];
//		}
//		int i = rr1.length;
//		int j = rr2.length;
//		while(i != 0 || j != 0)
//		{
//			add = add + rr1[i] + rr2[j];
//		}
//		
//		return add;
//	}
	
	/*public static void remove_zero(char[] rr1, char[] rr2)
	{
		
		//String str1 = " ";
		int[] ch1 =  new int[rr1.length];
		int x = 0;
		for(int i = 0; i  < rr1.length ; i++)
		{
			if(rr1[i] != 0 )
			{
				//str1 = str1 + rr1[i];
				ch1[x] = rr1[i] - '0';
				x++;
			}
		}
		//System.out.println("Removal after 0 in 1st :" + str1);
		for(int c : ch1)
		{
			System.out.print(c);
		}
		
		System.out.println();
		
		
		
		
		
		
		
		//String str2 = " ";
		int[] ch2 =  new int[rr2.length];
		int y = 0;
		for(int j = 0; j  < rr2.length ; j++)
		{
			if(rr2[j] != 0 )
			{
				//str2 = str2 + rr2[j];
				ch2[y] = rr2[j] - '0';
				y++;
			}
		}
		//System.out.println("Removal after 0 in 2st :" + str2);
		for(int c : ch2)
		{
			System.out.print(c);
		}
	}*/
	
	public static String shuffle1(String m2)
	{
		StringBuilder sb = new StringBuilder(m2);
		sb.reverse();
		return sb.toString(); //returns number in string format
		//return Integer.parseInt(sb.toString()); //returns number in number format
	}
	
	public static String shuffle(String m1)
	{
		StringBuilder sb = new StringBuilder(m1);
		sb.reverse();
		return sb.toString();
		//return Integer.parseInt(sb.toString());
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String m1 = sc.next();
		String m2 = sc.next();
		
		String r1 = shuffle(m1);
		System.out.println("Reverse 1st number : ");
		System.out.println(r1);
		String str1 = r1.replaceAll("0", "" ); 
		System.out.println("Removal of zero : ");
		System.out.println(str1);
		char[] rr1 = str1.toCharArray();
		int[] arr1 = new int[rr1.length];
		for(int i=0; i < arr1.length; i++)
		{
			//arr1[i] = Integer.parseInt(str1.charAt(i));// for string
			//arr1[i] = Integer.valueOf(rr1[i]); //for string array
			 arr1[i] = Character.getNumericValue(rr1[i]);
			
		}
		StringBuilder sb1 = new StringBuilder();
		for(int arr : arr1 )
		{
			sb1.append(arr);
		}
		int num1 = Integer.parseInt(sb1.toString());
		System.out.println(num1);
		
		
		
		
		
		
		
		
		
		
		String r2 = shuffle1(m2);
		System.out.println("Reverse 2nd number : ");
		System.out.println(r2);
		String str2 = r2.replaceAll("0", "" ); 
		System.out.println("Removal of zero : ");
		System.out.println(str2);
		char[] rr2 = str2.toCharArray();
		int[] arr2 = new int[rr2.length];
		for(int i=0; i < arr2.length; i++)
		{
			//arr1[i] = Integer.parseInt(str1.charAt(i));// for string
			//arr1[i] = Integer.valueOf(rr1[i]); //for string array
			 arr2[i] = Character.getNumericValue(rr2[i]);
			
		}
		StringBuilder sb2 = new StringBuilder();
		for(int arr : arr2 )
		{
			sb2.append(arr);
		}
		int num2 = Integer.parseInt(sb2.toString());
		System.out.println(num2);
		//add(rr1, rr2);
		
		//remove_zero(rr1, rr2);
		
		
		
		
		int num3 = num1 + num2;
		System.out.println("Addn is " + num3);
		
	}

}
