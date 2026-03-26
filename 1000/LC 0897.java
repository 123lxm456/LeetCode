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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        mid(root,list);
        TreeNode newroot = new TreeNode();
        TreeNode pre = newroot;
        for(int i = 0; i < list.size(); i++)
        {
            TreeNode cur = new TreeNode();
            cur.val = list.get(i); //TreeNode cur = new TreeNode(val);
            pre.right = cur;
            pre = cur;
        }
        /**
        for (int value : list) {
            cur.right = new TreeNode(value);
            cur = cur.right;
        }
        */
        return newroot.right;
    }
    public void mid(TreeNode root, List<Integer> list)
    {
        if(root == null)
        {
            return;
        }
        mid(root.left, list);
        list.add(root.val);
        mid(root.right, list);
    }
}
