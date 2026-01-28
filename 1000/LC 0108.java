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
    public TreeNode sortedArrayToBST(int[] nums) {
        return balance(nums,0,nums.length-1);
    }
    public TreeNode balance(int[] nums, int left, int right)
    {
        if(left > right)
        {
            return null;
        }
        int mid;
        mid = left + (right-left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = balance(nums,left,mid-1);
        node.right = balance(nums,mid+1,right);
        return node;
    }
}