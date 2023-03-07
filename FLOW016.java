// https://www.codechef.com/problems/FLOW016
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    public static long gcd(long a,long b){
        
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    long x = s.nextInt();
		    long y = s.nextInt();
		    long gcd =1;
		    
		    gcd = gcd(x,y);
		    long lcm = (x*y)/gcd;
		    System.out.println(gcd+" "+lcm);
		}
	}
}
