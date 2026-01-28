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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode merged = new TreeNode(t1.val + t2.val);
        merged.left = mergeTrees(t1.left, t2.left);
        merged.right = mergeTrees(t1.right, t2.right);
        return merged;
    }
}

/*
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        // 双空直接返回null，避免创建无意义节点
        if (root1 == null && root2 == null) {
            return null;
        }
        
        TreeNode root = new TreeNode();
        merge(root1, root2, root);
        return root;
    }
    
    public void merge(TreeNode root1, TreeNode root2, TreeNode root) {
        // 优化：用三元表达式简化赋值逻辑，同时规避双空情况
        int val1 = root1 != null ? root1.val : 0;
        int val2 = root2 != null ? root2.val : 0;
        root.val = val1 + val2;
        
        // 处理左子节点
        TreeNode left1 = root1 != null ? root1.left : null;
        TreeNode left2 = root2 != null ? root2.left : null;
        if (left1 != null || left2 != null) {
            root.left = new TreeNode();
            merge(left1, left2, root.left);
        }
        
        // 处理右子节点
        TreeNode right1 = root1 != null ? root1.right : null;
        TreeNode right2 = root2 != null ? root2.right : null;
        if (right1 != null || right2 != null) {
            root.right = new TreeNode();
            merge(right1, right2, root.right);
        }
    }
}
*/