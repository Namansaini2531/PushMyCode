# Sort an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums`, sort the array in ascending order and return it.

You must solve the problem  **without using any built-in**  functions in `O(nlog(n))` time complexity and with the smallest space complexity possible.

 

 **Example 1:** 

```
Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).

```

 **Example 2:** 

```
Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessarily unique.

```

 

 **Constraints:** 

- 1 <= nums.length <= 5 * 104
- -5  *104 <= nums[i] <= 5*  104

## Solution

**Language:** Java  
**Runtime:** 29 ms (beats 32.87%)  
**Memory:** 82.4 MB (beats 80.13%)  
**Submitted:** 2026-08-20T12:53:07.344Z  

```java
class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }

    private void mergeSort(int[] array){
        int length = array.length;
        if(length<=1){
            return; // base case
        }
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //left arr
        int j = 0; // right arr

        for(; i < length; i++){
            if(i<middle){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);   
    }

    private void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        int l = 0, r = 0, i = 0; //indices

        while(l < leftSize && r < rightSize){
            if(leftArray[l]<rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l<leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r<rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sort-an-array/)