package Recursion2;

public class Linear_Search {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			int[] arr = {1, 3, 5, 6, 8};
			int target = 5;
			System.out.println(find(arr, target, 0));
	}
	
	public static boolean find(int[] arr, int target, int index)
	{
		if(index==arr.length)
		{
			return false;
		}
		return arr[index]==target || find(arr, target, index+1);
	}

}
/*
true
*/