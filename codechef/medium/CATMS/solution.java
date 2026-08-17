import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int minSpeed = Integer.MAX_VALUE;
        int count = 0;
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
		    int speed = sc.nextInt();
		    
		    if(speed < minSpeed){
		        count++;
		        minSpeed = speed;
		    }
		}
		System.out.println(count);
	}
}
