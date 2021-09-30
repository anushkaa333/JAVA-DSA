import java.util.Arrays;
import java.util.Collections;

import java.util.List;
import java.util.Scanner;

public class array_sort {
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*String[] str = {"Banana", " apple", "mango"};
		Arrays.sort(str); //in asc order
		Arrays.sort(str, Collections.reverseOrder());// in desc order
		 for(int i = 0; i < str.length; i++)
          {
              System.out.print(str[i] + " ");
          }*//* ouput will be w/o brackets*/
		
		
		String[] str = {"Banana", " apple", "mango"};
		System.out.println(str);// string array cant be printed like this, u need to use for loop 
		System.out.println( "List is : " + Arrays.toString(str));
		List<String> a = Arrays.asList(str);
		System.out.println( "List is : " + a);
		//Collections.reverseOrder(a,2);
		//System.out.println(" After swapping " + a);
		Collections.sort(a);
		Collections.swap(a,0,2);
		Collections.swap(a,1,2);
		System.out.println(" After swapping " + Arrays.toString(str));/* ouput in brackets*/
		System.out.println(" After swapping " + a);
		
		
			String str1 = "AB BC CD";
			System.out.println("Strings is ;" + str1);
			String[] s1 = str1.split(" ");
			System.out.println("bEfore");
			for(String s : s1 )
			{
				System.out.print(s + " ");
			}
			
			String temp = s1[s1.length-1];
			for (int i=0; i < s1.length-1; i++)
			{
				
				s1[i+1] = s1[i];
				
			
			}
			s1[0] = temp;
			
			System.out.println();
			System.out.println("After");
			for(String s : s1 )
			{
				System.out.print(s + " ");
			}
			/*System.out.println();
			List<String> aa = Arrays.asList(s1);
			System.out.println(aa);
			
			Collections.swap(aa, 1, 2);
			Collections.swap(aa, 0, 1);
			
			System.out.println(aa);
		
			String[] str2 = aa.toArray();
			
			 System.out.println( );// for array output to be on new line 

			    
			    //printing result in array format
			    for (int i = 0 ; i < str2.length; i++)
			    {
			    	System.out.print(str2[i] + " ");
			    }*/
			    
			// https://www.geeksforgeeks.org/convert-an-arraylist-of-string-to-a-string-array-in-java/
	}	
		
	

}
