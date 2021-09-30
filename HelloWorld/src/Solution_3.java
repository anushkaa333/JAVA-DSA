import java.util.Scanner;

public class Solution_3 {
	
	public static String reverseString(String str1)
	{
		StringBuilder sb = new StringBuilder(str1);
		sb.reverse();
		return sb.toString();
	}
	
	public static int compareString(String str1, String str2)
	{
		int count = 0 ;
		int i=0;
		if(str1.charAt(i) == str2.charAt(i))
		{
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Scanner sc = new Scanner(System.in);
			
			/*System.out.println("Enter string length:");
			int sl = sc.nextInt();*/
			
			/*String str1 = new String();*/
			System.out.println("Enter first string:");
			String str1 = sc.nextLine();
			
			String str2 = reverseString(str1);
			System.out.println("Reverse string :" + str2);
			
			
			int result = compareString(str1, str2);
			System.out.println("Number of total characters:" + result);
			
			sc.close();
	}

}
