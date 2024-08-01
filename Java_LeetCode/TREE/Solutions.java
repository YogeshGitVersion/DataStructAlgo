package TREE;

/*
 * @author - yogesh
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solutions {
    public static void main(String[] args) {
        Integer[] valuesRoot ={5,1,2,3,null,6,4};
        TreeNode root = LeetcodeTreeBuilder.buildTreeFromList(valuesRoot);
        System.out.println(getDirections(root, 3,6));


    }
    public static String getDirections(TreeNode root, int startValue, int destValue) {
        String res = "";
        Stack<String> start_path = dfs(root, new Stack<String>(), startValue);
        Stack<String> dest_path = dfs(root, new Stack<String>(), destValue);

        System.out.println(start_path+" Start");
        System.out.println(start_path+" Dest");



        int i = 0;
        while(i < start_path.size() && i < dest_path.size()){
            if (!start_path.get(i).equals(dest_path.get(i) ))
                break;
            i++;
        }
        //start_path -> "U"
        for (int j = i; j < start_path.size(); j++) {
            res+="U";
        }
        //dest_path -> dest_path[i]
        for (int k = i; k < dest_path.size(); k++) {
            res+=dest_path.get(k);
        }

        return res;
    }

    public static Stack<String> dfs(TreeNode node, Stack path, int target){
        if (node == null){return new Stack<>();}

        if (node.val == target) return (Stack<String>) path.clone();
        //when we go left
        path.push("L");
        Stack<String> ans = dfs(node.left, path, target);
        if (!ans.isEmpty()) return ans;
        //if node.val is not in left go right and should pop the path
        path.pop();
        path.add("R");
        Stack ans2 = dfs(node.right, path, target);
        if (!ans2.isEmpty()) return ans2;
        // if node.val is not in both left and right child
        // it is not in this subtree
        // move to next subtree pop all before going to next subtree

        path.pop();

        return new Stack();
    }
}
