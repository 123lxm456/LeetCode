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
 /*
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
        {
            return true;
        }
        return istree(root.left,root.right);
    }
    public boolean istree(TreeNode root1,TreeNode root2)
    {
        if(root1==null && root2==null)
        {
            return true;
        }
        if(root1 ==null || root2==null)
        {
            return false;
        }
        if(root1.val !=root2.val)
        {
            return false;
        }
        return istree(root1.left,root2.right)&&istree(root1.right,root2.left);
    }
}
*/
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return istree(root,root);
    }
    public boolean istree(TreeNode root1,TreeNode root2)
    {
        Queue <TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root1);
        queue.add(root2);
        while(!queue.isEmpty())
        {
            root1 = queue.poll();
            root2 = queue.poll();
            if(root1==null && root2==null)
            {
                continue;
            }
            if(root1 ==null || root2==null || root1.val!=root2.val)
            {
                return false;
            }
            queue.add(root1.left);
            queue.add(root2.right);
            queue.add(root1.right);
            queue.add(root2.left);
        }
        return true;
    }
}
