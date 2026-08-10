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
		
		int p1 = 0;
		int p2 = 0;
		
		int maxLead = 0;
		int winner = 0;
		
		for(int i = 0; i < n; i++){
		    int s = sc.nextInt();
		    int t = sc.nextInt();
		    
		    p1+=s;
		    p2+=t;
		    
		    int lead = Math.abs(p1 - p2);
		    
		    if(lead >= maxLead){
		        lead = maxLead;
		        
		        if(p1>p2){
		            winner = 1;
		        }
		        else{
		            winner = 2;
		        }
		    }
		    
		}
		
		System.out.println(maxLead);
	}
}
