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
	
}

/*
 * DDRR
RRDD*/
