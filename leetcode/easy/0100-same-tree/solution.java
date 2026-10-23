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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true; // if both of the nodes are not present
        if(p == null || q == null) return false; // if one of the node not present
        if(p.val != q.val) return false; // if value mismatch

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}