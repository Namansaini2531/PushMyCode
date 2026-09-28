import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long sum = 0;
		long min = Long.MAX_VALUE;
		
		for(int i = 0; i < n; i++){
		    long h = sc.nextLong();
		    
		    sum += h;
		    
		    min = Math.min(min, h);
		}
		
		long ans = sum - (long) n * min;
		
		System.out.println(ans);
	}
}
