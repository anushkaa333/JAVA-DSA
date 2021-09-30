package Searching;

import java.util.Scanner;

//Smalllest letter greater than target
public class smallest_letter {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int m = sc.nextInt();
		char[] arr = new char[m];
		for(int i=0; i < arr.length ; i++)
		{
			arr[i] = sc.next().charAt(0);
		}
		System.out.println("Enter target element : ");
		char target = sc.next().charAt(0); 
		
		char ans = small(arr, target);
		System.out.println(ans);
	}
	
	public static char small(char[] arr, char target)
	{
		/*if(target > arr[arr.length - 1])
		{
			return -1;
		}*/
		
		int start = 0 ;
		int end = arr.length - 1;
		
		while(start <= end)
		{
			int mid = start + (end - start )/2;
			
			if(target < arr[mid])
			{
				end = mid -1;
			}
			else
			{
				start = mid + 1;
			}
		}
		return arr[start  % arr.length];
	}

}


/*
 Enter array size
5
a
e
j
n
r
Enter target element : 
r
a



Enter array size
5
a
e
j
n
r
Enter target element : 
l
n


*/
