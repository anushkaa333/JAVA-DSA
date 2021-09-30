

package Array;

import java.util.Arrays;
import java.util.HashSet;



public class Union1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer[] firstArray = {0,1,2,3,4,5,6,7,8,9};
		    Integer[] secondArray = {1,3,5,7,9};
		     
		    HashSet<Integer> s = new HashSet<>(); 
		     
		    s.addAll(Arrays.asList(firstArray));
		     
		    s.addAll(Arrays.asList(secondArray));
		     
		    System.out.println(s);
		     
		    //convert to array
		    Integer[] intersec  = {};
		    intersec = s.toArray(intersec);
		     
		    System.out.println( );// for array output to be on new line 

		    
		    //printing result in array format
		    for (int i = 0 ; i < intersec.length; i++)
		    {
		    	System.out.print(intersec[i] + " ");
		    }
		    
		    //printing result in list format
		    System.out.println( ); // for list output to be on new line 
		    System.out.println( Arrays.asList(intersec));
		     
		    /*System.out.println(Arrays.toString(intersec));*/
		    
		    System.out.println("count : " + intersec.length);
	}

}
