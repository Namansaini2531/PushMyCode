import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int k =  sc.nextInt();
		
		int n = s.length();
		int maxLen = 0;
		
		for(int i = 0; i < n; i++){
		    int zero = 0;
		    int one = 0;
		    
		    for(int j = i; j < n; j++){
		        if(s.charAt(j) == '0'){
		            zero++;
		        }
		        else{
		            one++;
		        }
		        
		        int len = j - i + 1;
		    
		        if(len % 2 == 0){
		            int need = Math.abs((zero - one) / 2);
		        
		            if(need <= k){
		                maxLen = Math.max(len, maxLen);
		            }
		        }
		    }
		}
		System.out.println(maxLen);
	}
}
