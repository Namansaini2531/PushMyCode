# Longest Substring with K Uniques

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string  **s**  consisting only lowercase alphabets and an integer  **k**. Your task is to find the  **length** of the  **longest substring**  that contains exactly  **k**  distinct characters.

 **Note :**  If no such substring exists, return  **-1**. 

 **Examples:** 

```
Input: s = "aabacbebebe", k = 3
Output: 7
Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'.

```

```
Input: s = "aaaa", k = 2
Output: -1
Explanation: There's no substring with 2 distinct characters.

```

```
Input: s = "aabaaab", k = 2
Output: 7
Explanation: The entire string "aabaaab" has exactly 2 unique characters 'a' and 'b', making it the longest valid substring.
```

 **Constraints:** 
1 ≤ s.size() ≤ 105
1 ≤ k ≤ 26

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T08:23:23.638Z  

```java
class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int max = 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int l = 0;
        int r = 0;
        
        while(r < s.length()){
            char ch = s.charAt(r);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }
            else{
                map.put(ch, map.get(ch) + 1);
            }
            while(map.size() > k){
                char chh = s.charAt(l);
                if(map.get(chh) == 1){
                    map.remove(chh);
                }
                else{
                    map.put(chh, map.get(chh) - 1);
                }
                l++;
            }
            if(map.size() == k){
                max = Math.max(max, r - l + 1);
            }
            r++;
        }
        return max == 0 ? -1 : max;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1)