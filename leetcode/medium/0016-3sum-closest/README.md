# 3Sum Closest

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` of length `n` and an integer `target`.

Find three integers at  **distinct indices**  in `nums` such that the sum is  **closest**  to `target`.

Return the sum of the three integers.

You may assume that each input would have  **exactly**  one solution.

 

 **Example 1:** 

```
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

```

 **Example 2:** 

```
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

```

 

 **Constraints:** 

- 3 <= nums.length <= 500
- -1000 <= nums[i] <= 1000
- -104 <= target <= 104

## Solution

**Language:** Java  
**Runtime:** 17 ms (beats 77.46%)  
**Memory:** 45.6 MB (beats 49.31%)  
**Submitted:** 2026-09-10T07:54:38.198Z  

```java
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];

        for(int i = 0; i < nums.length; i++){
            int l = i + 1;
            int r = nums.length - 1;

            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];

                if(Math.abs(target - sum) < Math.abs(target - closest)){
                    closest = sum;
                }
                else if(sum == target){
                    return sum;
                }
                else if(sum < target){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return  closest;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/3sum-closest/)