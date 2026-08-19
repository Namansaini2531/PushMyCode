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
		    int ans = 0;
		    int n = sc.nextInt();
		    
		    int[] arr = new int[2 * n];
		    
		    for(int i = 0; i<arr.length; i++){
		        arr[i] = sc.nextInt();
		    }
		
	    	for(int i = 0; i < n; i++){
		        ans = ans + Math.max(arr[i], arr[2 * n - 1 - i]);
		    }
		    System.out.println(ans);
		}
	}
}
