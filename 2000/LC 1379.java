/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode cur1 = original, cur2 = cloned;
        
        if(cur1 == null){
            return null;
        }
        if(cur1 == target){
            return cur2;
        }
        TreeNode left = getTargetCopy(cur1.left,cur2.left,target);
        if(left != null){
            return left;
        }
        return getTargetCopy(cur1.right,cur2.right,target);
    }
}
