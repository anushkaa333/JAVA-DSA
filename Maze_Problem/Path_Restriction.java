package Maze_Problem;

public class Path_Restriction {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		boolean[][] board = {
				{true, true, true},
				{true, false, true},
				{true, true, true},
		};
		
		pathR("", board, 0, 0);
	}

	public static void pathR(String str, boolean[][] maze, int r, int c)
	{
		if(r==maze.length-1 && c==maze[0].length-1)
		{
			System.out.println(str);
			return;
		}
		
		if(!maze[r][c])
		{
			return;
		}
		
		if(r<maze.length-1)
		{
			pathR(str+'D', maze, r+1, c);
		}
		
		if(c<maze[0].length-1)
		{
			pathR(str+'R', maze, r, c+1);
		}
	}
	
	public static void pathRC(boolean[][] board)
	{
		System.out.println("No of total paths : "+ p_Count(board, board.length-1 , board[0].length -1));

	}
	
	public static int p_Count(boolean[][] board, int r , int c)
	{
		if(r==0 || c==0)
		{
			return 1;
		}
		if(!board[r][c])
		{
			return 0;
		}
		int right = p_Count(board, r, c-1);
		int down = p_Count(board, r-1, c);
		int count = right + down;
		return count;
	}
	
	
}

/*
 * DDRR
RRDD
No of total paths : 2
*/
