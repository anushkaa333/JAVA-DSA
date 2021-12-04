package Maze_Problem;

public class All_paths {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		boolean[][] board = {
				{true, true, true},
				{true, true, true},
				{true, true, true},
		};
		
		All_paths("", board, 0 ,0);
	}

	
	public static void All_paths(String str, boolean[][] maze, int r, int c)
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
		
		maze[r][c] = false;
		
		if(r<maze.length-1)
		{
			All_paths(str+'D', maze, r+1, c);
		}
		
		if(c<maze[0].length-1)
		{
			All_paths(str+'R', maze, r, c+1);
		}
		
		if(r>0)
		{
			All_paths(str+'U', maze, r-1, c);
		}
		
		if(c>0)
		{
			All_paths(str+'L', maze, r, c-1);
		}
		
		maze[r][c] = true;
	}
	
}

/*
 * DDRR
DDRURD
DDRUURDD
DRDR
DRRD
DRURDD
RDDR
RDRD
RDLDRR
RRDD
RRDLDR
RRDLLDRR
*/
