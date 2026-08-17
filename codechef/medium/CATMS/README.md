# CATMS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Cars at Maximum Speed

There are $N$ cars entering a long straight road one after another. Overtaking is not allowed on this road.

You are given the maximum speed of each car in the order they enter the road. Each car tries to move at its maximum speed, but if there is a slower car in front of it, it must reduce its speed to avoid a collision.

A car is considered to be moving at its  **maximum speed**  if it does not need to slow down because of any car in front of it.

Find the number of cars that can move at their maximum speed.

### Input Format
- The first line contains a single integer $N$ — the number of cars.
- The second line contains $N$ space-separated integers $A_1,A_2,\ldots,A_N$, where $A_i$ represents the maximum speed of the $i$-th car.
### Output Format
- Print a single integer — the number of cars that can move at their maximum speed.
### Constraints
- $1 \le N \le 10^4$
- $1 \le A_i \le 2 \times 10^9$
- All $A_i$ are distinct.
### Sample 1:
Input
Output

```
5
7 5 6 3 4
```

```
3
```

### Explanation:

The first car can move at speed $7$.

The second car can move at its maximum speed $5$. The third car has maximum speed $6$, but it must slow down because the car in front is moving at speed $5$.

The fourth car can move at its maximum speed $3$, while the fifth car must slow down.

Therefore,  **3 cars**  can move at their maximum speed.

### Sample 2:
Input
Output

```
6
9 8 7 6 5 4
```

```
6
```

### Explanation:

Each car has a lower maximum speed than every car before it, so none of them needs to slow down.

Therefore, all  **6 cars**  can move at their maximum speed.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T16:05:32.668Z  

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

```

---

[View on CodeChef](https://www.codechef.com/problems/CATMS)