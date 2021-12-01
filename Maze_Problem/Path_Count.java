package Maze_Problem;

public class Path_Count 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(count(3,3));
	}
	
	
	public static int count(int r, int c)
	{
		if(r==1 || c==1)
		{
			return 1;
		}
		int left = count(r-1, c);//down
		int right = count(r, c-1);//right
		return right + left;
		
	}
	
}
/*
6
*/