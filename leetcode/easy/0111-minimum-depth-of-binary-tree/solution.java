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