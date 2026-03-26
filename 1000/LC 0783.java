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
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        mid(root,list);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list.size() - 1;i++)
        {
            int num = Math.abs(list.get(i) - list.get(i + 1));
            if(num < min)
            {
                min = num;
            }
        }
        return min;
    }
    public void mid(TreeNode root, List<Integer> list)
    {
        if(root == null)
        {
            return;
        }
        mid(root.left,list);
        list.add(root.val);
        mid(root.right,list);
    }
}

/**
//优化递归方法
class Solution {
    int pre;
    int ans;

    public int minDiffInBST(TreeNode root) {
        ans = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (pre == -1) {
            pre = root.val;
        } else {
            ans = Math.min(ans, root.val - pre);
            pre = root.val;
        }
        dfs(root.right);
    }
}

*/
