package Stack;

import java.util.Scanner;  
class stackk   
{  
    int top;   
    int maxsize;  
    int[] arr;
      
      
    boolean isEmpty()  
    {  
        return (top < 0);  
    }  
    stackk(int size)  
    {  
        top = -1;
        maxsize = size;
        arr = new int[maxsize];
    }  
    boolean push (Scanner sc)  
    {  
        if(top == maxsize-1)  
        {  
            System.out.println("Overflow !!");  
            return false;  
        }  
        else   
        {  
            System.out.println("Enter Value");  
            int val = sc.nextInt();  
            top++;  
            arr[top]=val;  
            System.out.println("Item pushed");  
            return true;  
        }  
    }  
    boolean pop ()  
    {  
        if (top == -1)  
        {  
            System.out.println("Underflow !!");  
            return false;  
        }  
        else   
        {  
            top --;   
            System.out.println("Item popped");  
            return true;  
        }  
    }  
    void display ()  
    {  
        System.out.println("Printing stack elements .....");  
        for(int i = top; i>=0;i--)  
        {  
            System.out.println(arr[i]);  
        }  
    }  
    void peek()
    {
    	/*try
    	{
    		arr[top] = -1;
    	}
    	catch(ArrayIndexOutOfBoundsException ex)
    	{
    		System.out.println("Exception is " + ex); 
    	}*/
    	
    	if(isEmpty())
    	{
    		System.out.println("Empty");
    	}
    	else
    	{
    		System.out.println(arr[top]);
    	}
    		
    }
}  
public class stack_full {  
public static void main(String[] args) {  
    int choice=0;  
    Scanner sc = new Scanner(System.in); 
	System.out.println("Size of stack");
	int size = sc.nextInt();
    stackk s = new stackk(size);  
    while(choice != 5)  
    {  
        System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Top\n5.Exit");  
        System.out.println("\n Enter your choice \n");        
        choice = sc.nextInt();  
        switch(choice)  
        {  
            case 1:  
            {   
                s.push(sc);  
                break;  
            }  
            case 2:  
            {  
                s.pop();  
                break;  
            }  
            case 3:  
            {  
                s.display();  
                break;  
            }  
            case 4 : 
            {
            	s.peek();
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
        };  
    }  
}  
}  