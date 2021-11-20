package Recursion2;
//check whether array is sorted or not
public class Array_sort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 5, 6, 8};
		System.out.println(sorted(arr,0));
	}
	
	public static boolean sorted(int[] arr, int index)
	{
		if(index == arr.length-1)
		{
			return true;
		}
		return arr[index]<arr[index+1] && sorted(arr, index+1);
	}
	
	
	
}
/*
true
*/