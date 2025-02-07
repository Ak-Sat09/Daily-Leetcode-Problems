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
   public List<TreeNode> generateTrees(int n) {
\treturn generateSubtrees(1, n);
}

private List<TreeNode> generateSubtrees(int s, int e) {
\tList<TreeNode> res = new LinkedList<TreeNode>();
\tif (s > e) {
\t\tres.add(null); // empty tree
\t\treturn res;
\t}

\tfor (int i = s; i <= e; ++i) {
\t\tList<TreeNode> leftSubtrees = generateSubtrees(s, i - 1);
\t\tList<TreeNode> rightSubtrees = generateSubtrees(i + 1, e);

\t\tfor (TreeNode left : leftSubtrees) {
\t\t\tfor (TreeNode right : rightSubtrees) {
\t\t\t\tTreeNode root = new TreeNode(i);
\t\t\t\troot.left = left;
\t\t\t\troot.right = right;
\t\t\t\tres.add(root);
\t\t\t}
\t\t}
\t}
\treturn res;
}
}