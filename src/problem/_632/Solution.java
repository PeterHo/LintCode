package problem._632;

public class Solution {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    /**
     * @param root the root of binary tree
     * @return the max ndoe
     */
    public TreeNode maxNode(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = maxNode(root.left);
        TreeNode right = maxNode(root.right);
        return max(root, max(left, right));
    }

    public TreeNode max(TreeNode a, TreeNode b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        if (a.val > b.val) {
            return a;
        }
        return b;
    }
}