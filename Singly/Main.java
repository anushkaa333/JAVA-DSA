package Singly;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LL list = new LL();
		list.insertFirst(3);
		list.insertFirst(5);
		list.insertFirst(8);
		list.insertFirst(17);
		list.display();
		//1
		//17 -> 8 -> 5 -> 3 ->  END
		
		
		list.insertLast(99);
		list.display();
		//2
		//17 -> 8 -> 5 -> 3 -> 99 ->  END 
		
		
		list.insert(100, 3);
		list.display();
		//3
		//17 -> 8 -> 5 -> 100 -> 3 -> 99 ->  END
		
		
		System.out.println(list.deleteFirst());
		list.display();
		//17
		//8 -> 5 -> 100 -> 3 -> 99 ->  END
		
		System.out.println(list.deleteLast());
		list.display();
		//99
		//8 -> 5 -> 100 -> 3 ->  END
		
		System.out.println(list.delete(2));
		list.display();
		//100
		//8 -> 5 -> 3 ->  END
	}

}
