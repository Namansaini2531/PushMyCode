import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int y = sc.nextInt();
		int b = sc.nextInt();
		int d = sc.nextInt();
		
		int sum = (x * a) + (y * b);
		
		if(sum >= d){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
}
