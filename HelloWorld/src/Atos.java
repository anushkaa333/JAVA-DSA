import java.util.Scanner;

public class Atos {

//	public static int max(int[] input4, int max)
//	{
//		for(int i=0; i < input4.length; i++)
//		{
//			if(input4[i] == max)
//				return i;
//		}
//	}
//	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] input4 = new int[m];
		for(int i=0; i < input4.length; i++)
		{
			input4[i] = sc.nextInt();
		}
		
		
		int max = input4[0];
		for(int i = 3 ; i < input4.length ; i=i+3)
		{
			if(max < input4[i])
			{
				max=input4[i];
			}
		}
		int max1 = 0;
		for(int i=0; i < input4.length; i++)
		{
			if(input4[i] == max)
				  max1 = i;
		}
		
		int min = input4[0];
		for(int i = 3 ; i < input4.length ; i=i+3)
		{
			if(min > input4[i])
			{
				min=input4[i];
			}
		}
		
		System.out.print(min+","+input4[max1+2]);
	}

}
/*
 * 
 * 4 5 7
9 3 2
5 1 3
2 4 1


2 is smallest among 4, 9, 5, 2 hence 2
and 9 is largest and its last pair is 2 hence 2
therefore final answer is 2,2. 


12
4
5
7
9
3
2
5
1
3
2
4
1


2,2
*/
