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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }
        dfs(root,"",result);
        return result;
    }
    public void dfs(TreeNode root, String path, List result)
    {
        if(path.isEmpty())
        {
            path += root.val;
        }
        else
        {
            path += "->" + root.val;
        }
        if(root.left == null && root.right == null)
        {
            result.add(path);
            return;
        }
        if(root.left != null)
        {
            dfs(root.left,path,result);
        }
        if(root.right != null)
        {
            dfs(root.right,path,result);
        }
    }
}

/*
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        // 节点队列
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        // 路径队列
        Queue<String> pathQueue = new LinkedList<>();

        nodeQueue.offer(root);
        pathQueue.offer(String.valueOf(root.val));

        while (!nodeQueue.isEmpty()) {
            TreeNode currNode = nodeQueue.poll();
            String currPath = pathQueue.poll();

            // 叶子节点，加入结果
            if (currNode.left == null && currNode.right == null) {
                result.add(currPath);
                continue;
            }

            // 左子节点入队
            if (currNode.left != null) {
                nodeQueue.offer(currNode.left);
                pathQueue.offer(currPath + "->" + currNode.left.val);
            }

            // 右子节点入队
            if (currNode.right != null) {
                nodeQueue.offer(currNode.right);
                pathQueue.offer(currPath + "->" + currNode.right.val);
            }
        }

        return result;
    }
}
*/