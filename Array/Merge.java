package Array;

import java.util.Arrays;
import java.util.HashSet;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		String str1[] = { "A", "E", "I" };          //source array  
		String str2[] = { "O", "U" };               //destination array  
		
		HashSet<String> s = new HashSet<>();
		s.addAll(Arrays.asList(str1));
		s.addAll(Arrays.asList(str2));
		System.out.println(s);
	
		String[] str3 = {};
		str3 = s.toArray(str3);
		
		for (String m : str3 )
		{
			System.out.print(m);
		}
		
		
	}

}
