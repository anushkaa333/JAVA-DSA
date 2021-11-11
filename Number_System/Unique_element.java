package Number_System;

public class Unique_element {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 3, 4, 2, 2, 6, 4};
		System.out.println(ans(arr));
		
	}
	
	private static int ans(int[] arr)
	{
		int unique = 0;
		 for(int n : arr)
		 {
			 unique ^= n;
		 }
		 return unique;
	}
	
	//it should ideally prints 6

}
