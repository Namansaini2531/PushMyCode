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
		    
		    int[] arr = new int[n];
		    
		    for(int i = 0; i < n; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    int wind = n - k;
		    
		    int sum = 0;
		    
		    for(int i = 0; i < wind; i++){
		        sum += arr[i];
		    }
		    
		    int maxSum = sum;
		    
		    //sliding window
		    
		    for(int i = wind; i < n; i++){
		        sum = sum + arr[i];
		        sum = sum - arr[i - wind];
		        
		        maxSum = Math.max(sum, maxSum);
		    }
		    
		    System.out.println(maxSum);
		}
	}
}
