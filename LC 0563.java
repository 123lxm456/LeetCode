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
 /**
class Solution {
    int ans = 0;

    public int findTilt(TreeNode root) {
        dfs(root);
        return ans;
    }

    public int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int sumLeft = dfs(node.left);
        int sumRight = dfs(node.right);
        ans += Math.abs(sumLeft - sumRight);
        return sumLeft + sumRight + node.val;
    }
}
*/
class Solution {
    int sum = 0;
    public int findTilt(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        int num = cal(root);
        sum += num;
        findTilt(root.left);
        findTilt(root.right);
        return sum;
    }
    public int cal(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int L = calsum(root.left);
        int R = calsum(root.right);
        return Math.abs(L - R);
    }
    public int calsum(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        return calsum(root.left)+calsum(root.right)+root.val;
    }
}

