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
		    int m = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    int[] cops = new int[m]
		    
		    for(int i = 0; i < m; i++){
		        cops[i] = sc.nextInt();
		    }
		    
		    int dist = x * y;
		    
		    boolean[] covered = new boolean[101];
		    
		    for(int cop : cops){
                int left = Math.max(1, cop - distance);
                int right = Math.min(100, cop + distance);
                for (int house = left; house <= right; house++) {
                    covered[house] = true;
                }
            }
            int safe = 0;
            for (int house = 1; house <= 100; house++) {
                if (!covered[house]) {
                    safe++;
                }
            }
            System.out.println(safe);
        }
        sc.close();
	}
}
