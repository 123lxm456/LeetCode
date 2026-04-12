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
    int sum = 0;//必须放在外面，因为放在里面是值传递，不会保存sum
    public int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);
        return sum;
    }
    public void dfs(TreeNode root, int cur)
    {
        if(root == null)
        {
            return ;
        }
        cur = cur * 2 + root.val;
        if(root.left == null && root.right == null)
        {
            sum += cur;
        }
        dfs(root.left, cur);
        dfs(root.right, cur);
    }
}

/**
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int val) {
        if (root == null) {
            return 0;
        }
        val = (val << 1) | root.val;
        if (root.left == null && root.right == null) {
            return val;
        }
        return dfs(root.left, val) + dfs(root.right, val);
    }
}
*/
