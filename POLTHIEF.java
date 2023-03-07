// https://www.codechef./problems/POLTHIEF
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
	        int x = s.nextInt();
	        int y = s.nextInt();
	        if(y>x || x==y){
	            System.out.println(y-x);
	        }else{
	            System.out.println(x-y);
	        }
	        
	  
	    }
	 }
}

