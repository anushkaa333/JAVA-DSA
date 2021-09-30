

package Pattern;

import java.util.Scanner;

public class p1 {
	
	public static void pat(int num)
	{
		for(int i=1; i <= num; i++)
		{
			for(int j=1; j <=i ; j++ )
			{
				System.out.print(i);
				if(j < i)
				{
					System.out.print("*");
					
				}
				
			}
			
			System.out.println();
		}
		
		for(int i=num; i >= 1; i--)
		{
			for(int j=1; j <=i ; j++ )
			{
				System.out.print(i);
				if(j < i)
				{
					System.out.print("*");
					
				}
				
			}
			
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pat(num);
	}

}


/*
 4
1
2*2
3*3*3
4*4*4*4
4*4*4*4
3*3*3
2*2
1
 */





