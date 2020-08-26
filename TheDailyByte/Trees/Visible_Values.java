package TheDailyByte.Trees;

import java.util.*;

public class Visible_Values {

    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(4);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(7);


        TreeNode tree2 = new TreeNode(7);
        tree2.left = new TreeNode(4);
        tree2.left.left = new TreeNode(1);
        tree2.left.right = new TreeNode(4);
        tree2.right = new TreeNode(9);
        tree2.right.right = new TreeNode(9);
        tree2.right.left = new TreeNode(8);
        tree2.right.right.right = new TreeNode(9);

          System.out.println(visiblevalues(tree1));
          System.out.println(visiblevalues(tree2));

    }

    static int max = 0;

    private static List<Integer> visiblevalues(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        helper(root, 1, list);
        max = 0;

        return list;
    }

    private static void helper(TreeNode root, int levels, List<Integer> list) {

        if(root == null) return;

        if(max < levels){
            list.add(root.value);
            max = levels;
        }

        helper(root.left, levels + 1, list);
        helper(root.right, levels + 1, list);

    }

}
