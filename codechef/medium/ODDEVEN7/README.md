# ODDEVEN7

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Odd Even

An array $B$ is called good if the parity of the elements keep alternating, i.e. odd, even, odd,.... or even, odd, even,...

You are given an array $A$ containing $N$ integers, and you can do the following action:

- Choose some subset of elements of $A$, and then rearrange that subset to form a good array.

Find the maximum size of subset you can choose which can be rearranged to a good array.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains $N$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the maximum size of a subset.

### Constraints
- $1 \le T \le 100$
- $1 \le N \le 100$
- $1 \le A_i \le 100$
### Sample 1:
Input
Output

```
2
5
1 3 7 4 5
4
1 1 2 4

```

```
3
4
```

### Explanation:

 **Test Case 1:**  We can choose the subset $\{1, 4, 5\}$. There is no need to reorder it, as it is already alternating.

 **Test Case 2:**  We can choose the subset $\{1, 1, 2, 4\}$ and reorder to get $[1, 2, 1, 4]$ which is alternating parity.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T16:24:30.429Z  

```java
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
		    int n = sc.nextInt();
		    int even = 0;
		    int odd = 0;
		    for(int i = 0; i < n; i++){
		        int x = sc.nextInt();
		        
		        if(x%2==0){
		            even++;
		        }
		        else{
		            odd++;
		        }
		    }
		    
		    int ans = 0;
		    
		    if(even == odd){
		        ans = n;
		    }
		    else{
		        ans = 2 * Math.min(even, odd) + 1;
		    }
		    
		    System.out.println(ans);
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ODDEVEN7)