// https://www.codechef.com/problems/MAXTASTE
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int c = s.nextInt();
		    int d = s.nextInt();
		    int res1 = Math.max(a,b);
		    int res2 = Math.max(c,d);
		    int res = res1+res2;
		    System.out.println(res);
		}
	}
}
