package TREE;
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if ( root == null)
            return false;
        return helper(root.left,root.right);
    }

    public boolean helper(TreeNode p, TreeNode q){
        if ( p == null && q == null) return true;
        if ( p == null || q == null || p.val != q.val ) return false;
        return helper(p.left,q.right) && helper(p.right, q.left);
    }
}
public class MainTree {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(10);


    }
}
