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
    Set<Integer> set = new HashSet<Integer>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
  */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        pre(root,list);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < list.size(); i++)
        {
            map.put(list.get(i), i);
        }
        for(int i = 0; i < map.size(); i++)
        {
            int num = list.get(i);
            if((map.containsKey(k - num)) && (map.get(k-num) != i))
            {
                return true;
            }
        }
        return false;
    }
    public void pre(TreeNode root, List<Integer> list)
    {
        if(root == null)
        {
            return ;
        }
        list.add(root.val);
        pre(root.left,list);
        pre(root.right,list);
    }
}