import java.util.Arrays;
import java.util.Scanner;

public class Capgem 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scc = new Scanner(System.in);
		int mm = scc.nextInt();
		int[] arr = new int[mm];
		int i = 1;
		int j = 1;
		int k = 0;
		while(5*i<=mm || 7*j <=mm)
		{
			if(5*i<=mm)
			{
				arr[k] = 5*i;
				i++;
				k++;
				if(7*j<=mm)
				{
					arr[k] = 7*j;
					j++;
					k++;
				}
			}
		}

		Arrays.sort(arr);
		for(int z : arr)
		{
			System.out.print(z + " ");
		}
	}
}
/*
 OUTPUT : 
50
5 7 10 14 15 21 20 28 25 35 30 42 35 49 40 45 50

 20
5 7 10 14 15 20 
*/
