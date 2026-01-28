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
    public boolean isBalanced(TreeNode root) {
        return isbalance(root) != -1;
    }
    public int isbalance(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int m,n;
        m = isbalance(root.left);
        if(m == -1)
        {
            return -1;
        }
        n = isbalance(root.right);
        if(n == -1)
        {
            return -1;
        }
       if(Math.abs(m-n) > 1)
       {
        return -1;
       }
       return m>n?m+1:n+1;
    }
    
}