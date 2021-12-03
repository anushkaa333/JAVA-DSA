package Maze_Problem;

import java.util.ArrayList;

public class Diagonal_Path {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(count(3,3));
		Diagonal("", 3, 3);
		System.out.println(DiagonalRt("", 3, 3));
	}
	
	public static int count(int r, int c)
	{
		if(r==1 || c==1)
		{
			return 1;
		}
		int left = count(r-1, c);//down
		int right = count(r, c-1);//right
		int diago = count(r-1, c-1); 
		return right + left + diago;
		
	}
	
	public static void Diagonal(String str, int r, int c)
	{
		if(r==1 && c==1)
		{
			System.out.println(str);
			return;
		}
		
		if(r>1)
		{
			Diagonal(str + 'V', r-1, c);
		}
		
		if(c>1)
		{
			Diagonal(str + 'H' , r, c-1);
		}
		
		if(c>1 && r>1)
		{
			Diagonal(str + 'D' , r-1, c-1);
		}
	}
	
	public static ArrayList<String> DiagonalRt(String str, int r, int c)
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
			list.addAll(DiagonalRt(str + 'V', r-1, c));
		}
		
		if(c>1)
		{
			list.addAll(DiagonalRt(str + 'H' , r, c-1));
		}
		
		if(c>1 && r>1)
		{
			list.addAll(DiagonalRt(str + 'D' , r-1, c-1));
		}
		return list;
	}
}

/*
 * 13
VVHH
VHVH
VHHV
VHD
VDH
HVVH
HVHV
HVD
HHVV
HDV
DVH
DHV
DD
[VVHH, VHVH, VHHV, VHD, VDH, HVVH, HVHV, HVD, HHVV, HDV, DVH, DHV, DD]*/
