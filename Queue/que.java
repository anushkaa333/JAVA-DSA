package Queue;

import java.util.Scanner;

class Qu
{
	int rear, front, capacity;
	int[] arr;
	
	Qu(int size)
	{
		rear = -1 ;
		front= -1;
		capacity = size;
		arr = new int[capacity];
	}
	
	void enqueue(Scanner sc)
	{
		int item = sc.nextInt();
		if(rear == capacity-1)
		{
			System.out.println("Overflow");
		}
		else
		{
			if(front==-1 && rear==-1)
			{
				front = 0;
				rear = 0;
			}
			else
			{
				rear = rear + 1;
			}
			arr[rear] = item;
		}
	}
	
	void dequeue()
	{
		if(front ==-1 || front > rear)
		{
			System.out.println("Underflow");
		}
		else
		{
			int d = arr[front];
			if(front==rear)
			{
				front =  rear - 1;
				
			}
			else
			{
				front = front + 1;
			}
			System.out.println(d + "is removed");
		}
	}
	
	void display()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is empty");
		}
		
		if(front==rear)
		{
			System.out.println(arr[front]);
		}
		else
		{
			for(int i=rear; i>=front; i--)
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	boolean fe()
	{
		if(front > rear)
		{
			System.out.println("Rear is smaller than front");
			return false;
		}
		else
		{
			System.out.println(arr[front]);
			return true;
		}
		
	}
	
}



public class que 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of queue");
		int size = sc.nextInt();
		Qu q = new Qu(size);
		int choice =0;
		while(choice!=5)
		{
			System.out.println("Enter Choice\n1.Insert\n2.Delete\n3.Display\n4.Front element\n5.exit");
			 choice = sc.nextInt();
			
			switch(choice)
			{
				case 1 : 
				{
					q.enqueue(sc);
					break;
				}
				
				case 2 : 
				{
					q.dequeue();
					break;
				}
				
				case 3 :
				{
					q.display();
					break;
				}
				
				case 4 : 
				{
					q.fe();
					break;
				}
				
				 case 5:   
		         {  
		                System.out.println("Exiting....");  
		                System.exit(0);  
		                break;   
		         }  
		         
				 default:  
		            {  
		                System.out.println("Please Enter valid choice ");  
		            }   
			}
		}
	}

}
