import java.util.Scanner;

public class Solution_1 {
	
	public static int countNumber(int[] bill)
	{
		int count = 0;

		for (int i=0 ; i < bill.length ; i++)
		{
			double a = Math.sqrt(bill[i]);
			double b = a - Math.floor(a);
			if(b==0)
			{
				count++;
			}
			else
			{
				continue;
			}
		}
		return count;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		/*int n = sc.nextInt();*/
		
		 
		/*System.out.println(Math.sqrt(n));*/
		System.out.print("Enter array size : ");
		int bill_size = sc.nextInt();
		
		int bill[] = new int[bill_size];
		for(int i=0; i< bill_size ; i++)
		{
			bill[i] = sc.nextInt();
		}
		
		for(int i : bill)
			System.out.print(i + " ");
		
		int result = countNumber(bill);
		System.out.println("Number of people: " + result);
		
		sc.close();
	}

}
