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
		    int even = 0;
		    int odd = 0;
		    for(int i = 0; i < n; i++){
		        int x = sc.nextInt();
		        
		        if(x%2==0){
		            even++;
		        }
		        else{
		            odd++;
		        }
		    }
		    
		    int ans = 0;
		    
		    if(even == odd){
		        ans = n;
		    }
		    else{
		        ans = 2 * Math.min(even, odd) + 1;
		    }
		    
		    System.out.println(ans);
		}
	}
}
