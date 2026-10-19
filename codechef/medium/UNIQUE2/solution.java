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
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i = 0; i < n; i++){
		    int x = sc.nextInt();
		    
		    if(set.add(x)){
		        System.out.println(x + " ");
		    }
		}
		sc.close();
	}
}
