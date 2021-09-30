import java.util.Scanner;

public class Solution_2 
{
	public static int numOfProducts(char product_ID[])
	{
		int count = 0 ;
		for(int i = 0; i < product_ID.length; i++)
		{
			if(product_ID[i] =='a' || product_ID[i] =='e' || product_ID[i] =='i' || product_ID[i] =='o' || product_ID[i] =='u' || product_ID[i]=='A' || product_ID[i]=='E' || product_ID[i]=='I' || product_ID[i]=='O' || product_ID[i]=='U' )
			{
				continue;
			}
			else
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int product_size = sc.nextInt();
		
		char product_ID[] = new char[product_size];
		for (int i=0; i<product_size; i++)
		{
			product_ID[i] = sc.next().charAt(0);
		}
		
//		for(char i : product_ID)
//		{
//			System.out.println(i + " ");
//		}
		
		int result = numOfProducts(product_ID);
		System.out.println("Number of counts:" + result);
		
		sc.close();
	}

}
