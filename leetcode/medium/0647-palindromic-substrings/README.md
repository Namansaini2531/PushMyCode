# Palindromic Substrings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, return  *the number of  **palindromic substrings**  in it*.

A string is a  **palindrome**  when it reads the same backward as forward.

A  **substring**  is a contiguous sequence of characters within the string.

 

 **Example 1:** 

```
Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".

```

 **Example 2:** 

```
Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 822 ms (beats 9.57%)  
**Memory:** 46.9 MB (beats 13.37%)  
**Submitted:** 2026-09-10T09:04:14.642Z  

```java
class Solution {
    public int countSubstrings(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            String str = "";
            for(int j = i; j < s.length(); j++){
                char ch = s.charAt(j);
                str = str + ch;
                if(p(str)){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean p(String x){
        int i = 0;
        int j = x.length() - 1;

        while(i <= j){
            if(x.charAt(i) != x.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindromic-substrings/)