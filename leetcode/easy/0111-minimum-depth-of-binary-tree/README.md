# Minimum Depth of Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Bloomberg
tcs
Microsoft
Google
Meta

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

 **Note:**  A leaf is a node with no children.

 

 **Example 1:** 

```
Input: root = [3,9,20,null,null,15,7]
Output: 2

```

 **Example 2:** 

```
Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 105].
- -1000 <= Node.val <= 1000

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 72.84%)  
**Memory:** 82.5 MB (beats 5.67%)  
**Submitted:** 2026-10-23T04:54:39.827Z  

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0; // if root does not exist
        if(root.left == null) return 1 + minDepth(root.right); // if leftnode is null
        if(root.right == null) return 1 + minDepth(root.left); // if rightnode is null

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-depth-of-binary-tree/)