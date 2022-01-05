package Recursion4;

import java.util.ArrayList;
import java.util.Scanner;

public class ph_no {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		ph("", num);
		System.out.println(ph_n("", num));
	}
	
	public static void ph(String str, String num)
	{
		if(num.isEmpty())
		{
			System.out.println(str);
			return;
		}
		int digit = num.charAt(0) - '0';
		for(int i = (digit -1)*3; i < digit*3 ; i++)
		{
			char ch = (char)('a' + i);
			ph(str + ch, num.substring(1));
		}
	}
	
	public static ArrayList<String> ph_n(String str, String num)
	{
		if(num.isEmpty())
		{
			ArrayList<String> list = new ArrayList<String>();
			list.add(str);
			return list;
		}
		
		ArrayList<String> list  = new ArrayList<String>();
		
		int digit  = num.charAt(0) - '0';
		for(int i = (digit - 1)*3 ; i  <digit*3; i++)
		{
			char ch = (char)('a' + i);
			list.addAll(ph_n(str+ch , num.substring(1)));
		}
		
		return list;
	}

}

/*
 * 12
ad
ae
af
bd
be
bf
cd
ce
cf
[ad, ae, af, bd, be, bf, cd, ce, cf]

*
*
*234
dgj
dgk
dgl
dhj
dhk
dhl
dij
dik
dil
egj
egk
egl
ehj
ehk
ehl
eij
eik
eil
fgj
fgk
fgl
fhj
fhk
fhl
fij
fik
fil
[dgj, dgk, dgl, dhj, dhk, dhl, dij, dik, dil, egj, egk, egl, ehj, ehk, ehl, eij, eik, eil, fgj, fgk, fgl, fhj, fhk, fhl, fij, fik, fil]
*/
