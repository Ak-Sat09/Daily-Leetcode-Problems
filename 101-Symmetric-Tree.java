 class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true; // Base case: empty tree is symmetric
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
