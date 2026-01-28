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
    List<Integer> list = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        mediumtraverse(root);
        int min = list.get(1) - list.get(0);
        for(int i = 1; i < list.size() - 1; i++)
        {
            int num = list.get(i + 1) - list.get(i);
            if(num < min)
            {
                min = num;
            }
        }
        return min;
    }
    public void mediumtraverse(TreeNode root)
    {
        if (root == null) {
            return;
        }
        mediumtraverse(root.left);
        list.add(root.val);
        mediumtraverse(root.right);
    }
}
/**
class Solution {
    // 类成员变量：pre记录上一个遍历到的节点值，ans记录最小差值
    int pre;
    int ans;

    // 主方法：初始化变量并启动深度优先遍历
    public int getMinimumDifference(TreeNode root) {
        // 初始化最小差值为整数最大值（确保第一次比较会被更新）
        ans = Integer.MAX_VALUE;
        // 初始化pre为-1（作为“还未遍历到任何节点”的标记）
        pre = -1;
        // 启动中序遍历
        dfs(root);
        // 返回最终的最小差值
        return ans;
    }

    // 深度优先遍历（中序：左 -> 根 -> 右）
    public void dfs(TreeNode root) {
        // 递归终止条件：节点为空，直接返回
        if (root == null) {
            return;
        }
        // 1. 先遍历左子树（中序遍历的左分支）
        dfs(root.left);
        
        // 2. 处理当前节点（中序遍历的根节点）
        if (pre == -1) {
            // 第一次遍历到节点（最左的节点），只记录值，不计算差值
            pre = root.val;
        } else {
            // 计算当前节点与前一个节点的差值，更新最小差值
            ans = Math.min(ans, root.val - pre);
            // 更新pre为当前节点值，供下一个节点比较
            pre = root.val;
        }
        
        // 3. 遍历右子树（中序遍历的右分支）
        dfs(root.right);
    }
}
*/
