package TREE;

public class TreeNode {
    int val;
    TreeNode left, right;


//    public TreeNode(){
//        this(null,null,null);
//    }
//    public TreeNode(Object val){
//        this(val, null, null);
//    }
    public TreeNode(int val){
        this.val = val;
    }

    public TreeNode getLeft() {
        return this.left;
    }
    public int getVal(){
        return this.val;
    }
}
