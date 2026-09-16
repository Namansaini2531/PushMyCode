import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int n = sc.nextInt();
		    
		    int k = sc.nextInt();
		    
		    int ans = Math.max(0, 2 * (k - n));
		    
		    System.out.println(ans);
		}
		sc.close();
	}
}
