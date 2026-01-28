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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List <Integer> list1 = new ArrayList<>();
        List <Integer> list2 = new ArrayList<>();
        List <Integer> list3 = new ArrayList<>();
        List <Integer> list4 = new ArrayList<>();
        pre(p,list1);
        mid(p,list2);
        pre(q,list3);
        mid(q,list4);
        if(list1.equals(list3) && list2.equals(list4))
        {
            return true;
        }
        return false;
    }
    public void pre(TreeNode root, List<Integer> list)
    {
        if(root == null)
        {
            list.add(null);
            return;
        }
        list.add(root.val);
        pre(root.left,list);
        pre(root.right,list);
    }
    public void mid(TreeNode root, List<Integer> list)
    {
        if(root == null)
        {
            list.add(null);
            return;
        }
        mid(root.left,list);
        list.add(root.val);
        mid(root.right,list);
    }
}
*/

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
        {
            return true;
        }
        else if(p==null || q==null)
        {
            return false;
        }
        else if(p.val != q.val)
        {
            return false;
        }
        else
        {
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
    }
}

 