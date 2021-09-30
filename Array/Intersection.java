package Array;


import java.util.Arrays;
import java.util.HashSet;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer[] firstArray = {0,1,2,3,4,5,6,7,8,9};
		    Integer[] secondArray = {1,3,5,7,9};
		     
		    HashSet<Integer> s = new HashSet<>(); 
		     
		    s.addAll(Arrays.asList(firstArray));
		     
		    s.retainAll(Arrays.asList(secondArray));
		     
		    System.out.println(s);
		     
		    //convert to array
		    Integer[] intersec  = {};
		    intersec = s.toArray(intersec);
		     
		    System.out.println(Arrays.toString(intersec));
		    
		    System.out.println("count : " + intersec.length);
	}

}
