package String;

import java.util.Arrays;
import java.util.Scanner;

public class Shuffle {
	
	public static String sortString(String str) {
		  
	    char[] charArray = str.toCharArray();
	    Arrays.sort(charArray);

	    // convert char array back to string
	    str = String.valueOf(charArray);

	    return str;
	  }
	
	public static void shuffle(String str1, String str2, String str3)
	{
		str1 = sortString(str1);
		str2 = sortString(str2);
		str3 = sortString(str3);
		if((str1+str2).length()!=str3.length())
		{
			System.out.println(str1 +  " and " + str2 + " are not subsets of " + str3 );
		}
		else if(str1.indexOf(str3)!= -1 && str2.indexOf(str3)!= -1 )
		{
			System.out.println(str1 +  " and " + str2 + " are subsets of " + str3 ); 
		}
		else
			{
				System.out.println(str1 +  " and " + str2 + " are not subsets of " + str3 );
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string:");
		String str1 = sc.nextLine();
		
		System.out.println("Enter 2nd string:");
		String str2 = sc.nextLine();
		
		/*if(str1.indexOf(str2)!=-1)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false );
		}*/
		
		System.out.println("Enter result string:");
		String[] str3 = new String[3];
		for( int i=0; i < str3.length; i++)
		{
			str3[i] = sc.nextLine();
		}
		
		for(int j=0; j < str3.length; j++)
		{
			shuffle(str1, str2, str3[j]);
			
		}
		
	}

}

/*import java.util.Arrays;

class Shuffle {


  // length of result string should be equal to sum of two strings
  static boolean checkLength(String first, String second, String result) {
    if (first.length() + second.length() != result.length()) {
      return false;
    }
    else {
      return true;
    }
  }

  // this method converts the string to char array 
  // sorts the char array
  // convert the char array to string and return it
  static String sortString(String str) {
  
    char[] charArray = str.toCharArray();
    Arrays.sort(charArray);

    // convert char array back to string
    str = String.valueOf(charArray);

    return str;
  }

  // this method compares each character of the result with 
  // individual characters of the first and second string
  static boolean shuffleCheck(String first, String second, String result) {
    
    // sort each string to make comparison easier
    first = sortString(first);
    second = sortString(second);
    result = sortString(result);

    // variables to track each character of 3 strings
    int i = 0, j = 0, k = 0;

    // iterate through all characters of result
    while (k != result.length()) {

      // check if first character of result matches
      // with first character of first string
      if (i < first.length() && first.charAt(i) == result.charAt(k))
        i++;

      // check if first character of result matches
      // with the first character of second string
      else if (j < second.length() && second.charAt(j) == result.charAt(k))
        j++;

      // if the character doesn't match
      else {
        return false;
      }

      // access next character of result
      k++;
    }

    // after accessing all characters of result
    // if either first or second has some characters left
    if(i < first.length() || j < second.length()) {
      return false;
    }

    return true;
  }

  public static void main(String[] args) {

    String first = "XY";
    String second = "12";
    String[] results = {"1XY2", "Y1X2", "Y21XX"};

    // call the method to check if result string is
    // shuffle of the string first and second
    for (String result : results) {
      if (checkLength(first, second, result) == true && shuffleCheck(first, second, result) == true) {
        System.out.println(result + " is a valid shuffle of " + first + " and " + second);
      }
      else {
        System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
      }
    }
  }
}*/
