package Doubly;


public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DLL list = new DLL();
		list.insertFirst(3);
		list.insertFirst(5);
		list.insertFirst(8);
		list.insertFirst(17);
		list.display();
		//17->8->5->3->End
		list.displayRev();
		//17->8->5->3->End
		//In Reverse order
		//3->5->8->17->START
		
		list.insertLast(99);
		list.display();
		//17-> 8-> 5-> 3-> 99-> END
		
		list.insertAfter(8, 65);
		list.display();
		//17-> 8-> 65-> 5-> 3-> 99-> END
	}

}
