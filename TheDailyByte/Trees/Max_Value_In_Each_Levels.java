package TheDailyByte.Trees;

import java.util.*;

public class Max_Value_In_Each_Levels {


    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(2);
        tree1.left = new TreeNode(10);
        tree1.right = new TreeNode(15);
        tree1.right.right = new TreeNode(20);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(5);
        tree2.left.left = new TreeNode(5);
        tree2.left.right = new TreeNode(3);
        tree2.right = new TreeNode(6);
        tree2.right.right = new TreeNode(7);

        System.out.println(levelmax(tree1));
        System.out.println(levelmax(tree2));

    }

    private static List<Integer> levelmax(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list, 0);

        return list;
    }

    private static void helper(TreeNode root, List<Integer> list, int i) {
        if(root == null) return;

        if(i == list.size()){
            list.add(root.value);
        }
        else{
            list.set(i, Math.max(list.get(i), root.value));
        }
        helper(root.left, list, i + 1);
        helper(root.right, list, i + 1);
    }

}
