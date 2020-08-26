package TheDailyByte.Trees;

import java.util.*;

public class Bottom_Up {

    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(2);
        tree1.left = new TreeNode(1);
        tree1.right = new TreeNode(2);

        TreeNode tree2 = new TreeNode(7);
        tree2.left = new TreeNode(6);
        tree2.right = new TreeNode(2);
        tree2.left.left = new TreeNode(3);
        tree2.left.right = new TreeNode(3);

        System.out.println(bottom_up(tree1));
        System.out.println(bottom_up(tree2));

    }

    private static List<List<Integer>> bottom_up(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()){

            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0 ; i < size ; i++){
                TreeNode current = queue.remove();
                level.add(current.value);
                if(current.left != null)
                    queue.add(current.left);
                if(current.right != null)
                    queue.add(current.right);
            }

            result.add(0, level);
        }
        return result;
    }

}
