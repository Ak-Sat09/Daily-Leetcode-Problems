 class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) helper(root, \\, paths);
        return paths;
    }

    private void helper(TreeNode node, String path, List<String> paths) {
        path += node.val;
        if (node.left == null && node.right == null) {
            paths.add(path); // Leaf node, add path
        } else {
            if (node.left != null) helper(node.left, path + \->\, paths);
            if (node.right != null) helper(node.right, path + \->\, paths);
        }
    }
}
