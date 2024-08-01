package TREE;

public class TreeNode {
    int val;
    TREE.TreeNode left;
    TREE.TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TREE.TreeNode left, TREE.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}