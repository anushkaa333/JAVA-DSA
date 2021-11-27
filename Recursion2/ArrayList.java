package Recursion2;
import java.util.ArrayList;

public class ArrayList {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] arr = {1, 2,, 3, 4, 4, 5, 6};
		int target = 4;
		
		System.out.println(findAllindex(arr, target, 0));
	}
	
	public static ArrayList<Integer> findAllindex(int[] arr, int target, int index)
	{
		
		ArrayList<Integer> list = new ArrayList<>();
		if(index == arr.length)
		{
			return list;
		}
		
		if(arr[index]==index)
		{
			list.add(index);
		}
		ArrayList<Integer> ansFromBelowCalls = findAllindex(arr, target, index+1, list);
		
		list.addAll(ansFromBelowCalls);
		return list;
	}

}

/*
 *
 * 
 At what index 4 has occured
 [3,4]
 * */
