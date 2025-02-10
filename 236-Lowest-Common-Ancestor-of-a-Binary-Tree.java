class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if root is null or matches p or q, return root
        if (root == null || root == p || root == q) {
            return root;
        }
        
        // Recursively search in left and right subtree
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        // If both left and right are non-null, this is the LCA
        if (left != null && right != null) {
            return root;
        }
        
        // Otherwise, return the non-null subtree
        return left != null ? left : right;
    }
}
