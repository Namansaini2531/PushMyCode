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
		int[] height = new int[n];
		
		for(int i = 0; i < n; i++){
		    height[i] = sc.nextInt();
		}
		
		int h = height.length;
		int left = 0;
		int right = n - 1;
		int maxArea = 0;
		
		while(left<right){
		    int width = right - left;
		    int area = Math.min(height[left], height[right])*width;
		    
		    maxArea = Math.max(maxArea, area);
		    
		    if(height[left]<height[right]){
		        left++;
		    }
		    else{
		        right--;
		    }
		}
		System.out.println(maxArea);
	}
}
