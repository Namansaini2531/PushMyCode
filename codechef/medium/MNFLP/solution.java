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
		    
		    int[] arr =  new int[n];
		    
		    int countA = 0;
		    int countB = 0;
		    
		    for(int i = 0; i < n; i++){
		        if(arr[i] == 1){
		            countA++;
		        }
		        else if(arr[i] == -1){
		            countB++;
		        }
		    }
		    
		    int diff = Math.abs(countA - countB);
		    
		    if(diff == 0){
		        System.out.println(0);
		    }
		    else if(diff == 1){
		        System.out.println(1);
		    }
		    else{
		        System.out.println(-1);
		    }
		}
	}
}
