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
    public int findSecondMinimumValue(TreeNode root) {
        return dfs(root,root.val);
    }
    public int dfs(TreeNode root, int minVal)
    {
        if(root == null)
        {
            return -1;
        }
        if(root.val > minVal)
        {
            return root.val;
        }
        int leftval = dfs(root.left, minVal);
        int rightval = dfs(root.right, minVal);
        if(leftval == -1)
        {
            return rightval;
        }
        if(rightval == -1)
        {
            return leftval;
        }
        return Math.min(leftval, rightval);
    }
}