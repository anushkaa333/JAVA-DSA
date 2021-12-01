package Maze_Problem;

import java.util.ArrayList;

public class Path_Print {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		print_paths(" ", 3, 3);
		System.out.println(pathRet("", 3, 3));
	}

	
	public static void print_paths(String str, int r, int c)
	{
		if(r==1 && c==1)
		{
			System.out.println(str);
			return;
		}
		
		if(r>1)
		{
			 print_paths(str+'D', r-1, c);
		}
		
		if(c>1)
		{
			 print_paths(str+'R', r, c-1);
		}
	}
	// array list
	public static ArrayList<String> pathRet(String str, int r, int c)
	{
		if(r==1 && c==1)
		{
			ArrayList<String> list = new ArrayList<String>();
			list.add(str);
			return list;
		}
		
		ArrayList<String> list = new ArrayList<String>();
		
		if(r>1)
		{
			 list.addAll(pathRet(str+'D', r-1, c));
		}
		
		if(c>1)
		{
			 list.addAll(pathRet(str+'R', r, c-1));
		}
		
		return list;
	}
}
/*
DDRR
DRDR
DRRD
RDDR
RDRD
RRDD
//for array list
[DDRR, DRDR, DRRD, RDDR, RDRD, RRDD]
*/