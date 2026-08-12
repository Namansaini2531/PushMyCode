import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int r = sc.nextInt();
		
		boolean Found = false;
		
		for(int i = l; i<r; i++){
		    if(i%2==0){
		        Found = true;
		        break;
		    }
		}
		
		if(Found == true){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
	}
}
