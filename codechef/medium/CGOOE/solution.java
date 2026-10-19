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
		    
		    int[] nums = new int[n];
		    
		    for(int i = 0; i < n; i++){
		        nums[i] = sc.nextInt();
		    }
		    
		    int count = 0;
		    int pos = 0;
		    
		    for(int i = 1; i < n; i++){
		        if(nums[i] > nums[i-1]){
		            count++;
		            if(count)
		        }
		        else{
		            count = 0;
		        }
		    }
		}
	}
}
