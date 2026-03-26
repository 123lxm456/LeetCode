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
    int depx = 0, depy = 0;
    TreeNode parentx, parenty;
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, null, x, y, 0);
        return depx == depy && parentx != parenty;
    }
    public void dfs(TreeNode root, TreeNode pre, int x, int y, int k)
    {
        if(root == null)
        {
            return ;
        }
        if(root.val == x)
        {
            depx = k;
            parentx = pre;
        }
        if(root.val == y)
        {
            depy = k;
            parenty = pre;
        }
        dfs(root.left, root, x, y, k+1);
        dfs(root.right, root, x, y, k+1);
    }
}

/**
class Solution {
    // x 的信息
    int x;
    TreeNode xParent;
    int xDepth;
    boolean xFound = false;

    // y 的信息
    int y;
    TreeNode yParent;
    int yDepth;
    boolean yFound = false;

    public boolean isCousins(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        dfs(root, 0, null);
        return xDepth == yDepth && xParent != yParent;
    }

    public void dfs(TreeNode node, int depth, TreeNode parent) {
        if (node == null) {
            return;
        }

        if (node.val == x) {
            xParent = parent;
            xDepth = depth;
            xFound = true;
        } else if (node.val == y) {
            yParent = parent;
            yDepth = depth;
            yFound = true;
        }

        // 如果两个节点都找到了，就可以提前退出遍历
        // 即使不提前退出，对最坏情况下的时间复杂度也不会有影响
        if (xFound && yFound) {
            return;
        }

        dfs(node.left, depth + 1, node);

        if (xFound && yFound) {
            return;
        }

        dfs(node.right, depth + 1, node);
    }
}
*/
