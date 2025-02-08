 class Solution {
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    public int height(TreeNode root) {
        if (root == null) return 0;  // Only return 0 if the node is NULL
        
        int l = height(root.left);
        int r = height(root.right);
        
        diameter = Math.max(diameter, l + r);
        
        return Math.max(l, r) + 1; // Height of the current node
    }
}
