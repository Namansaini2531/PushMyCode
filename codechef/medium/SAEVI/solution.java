import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		int[] arr = new int[n];
		long sum = 0;
		
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		    
		    if(i%2 == 0 && arr[i] > (2 * k)){
		        sum += arr[i];
		    }
		}
		
		System.out.println(sum);
	}
}
