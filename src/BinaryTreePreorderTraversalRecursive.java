import java.util.ArrayList;
import java.util.List;

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

public class BinaryTreePreorderTraversalRecursive {
    public static List<Integer> preorderTraversal(TreeNode root) {
        return dfs(root, new ArrayList());
    }

    private static List<Integer> dfs(TreeNode root, List<Integer> list){
        if(root == null) return list;

        list.add(root.val);
        list = dfs(root.left, list);
        return dfs(root.right, list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.right = new TreeNode(6);
        root.left = new TreeNode(4);
        List<Integer> ls = preorderTraversal(root);
        for(int i : ls) System.out.println("Node Value: " + i);
    }
}
