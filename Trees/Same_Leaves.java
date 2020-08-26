package TheDailyByte.Trees;

import java.util.*;

public class Same_Leaves {

    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(1);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(7);
        tree2.left = new TreeNode(1);
        tree2.right = new TreeNode(2);

        TreeNode tree3 = new TreeNode(8);
        tree3.left = new TreeNode(2);
        tree3.right = new TreeNode(29);
        tree3.right.left = new TreeNode(3);
        tree3.right.right = new TreeNode(9);

        TreeNode tree4 = new TreeNode(8);
        tree4.left = new TreeNode(2);
        tree4.left.left = new TreeNode(2);
        tree4.right = new TreeNode(29);
        tree4.right.left = new TreeNode(3);
        tree4.right.left.right = new TreeNode(3);
        tree4.right.right = new TreeNode(9);

        System.out.println(same_leaves(tree1, tree2));
        System.out.println(same_leaves(tree3, tree4));


    }

    private static boolean same_leaves(TreeNode root1, TreeNode root2) {

        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();

        dfs(root1, leaves1);
        dfs(root2, leaves2);

        return leaves1.equals(leaves2);
    }

    private static  void dfs(TreeNode root, List<Integer> leaves) {

        if(root != null){
            if(root.left ==null && root.right == null)
                leaves.add(root.value);
            dfs(root.left, leaves);
            dfs(root.right, leaves);
        }

    }

}
