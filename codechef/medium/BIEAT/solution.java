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
		int[] arr = new int[n];
		
		for(int i : arr){
		    arr[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		
		for(int i = 0; i < n; i++){
		    arr[i] = arr[i] >> m;
		    System.out.println(arr[i] + " ");
		}
	}
}
