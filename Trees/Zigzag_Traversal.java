package TheDailyByte.Trees;

import java.util.*;

public class Zigzag_Traversal {

    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(8);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(29);
        tree2.right.left = new TreeNode(3);
        tree2.right.right = new TreeNode(9);

        System.out.println(zigzagtraversal(tree1));
        System.out.println(zigzagtraversal(tree2));

    }

    private static List<List<Integer>> zigzagtraversal(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            if(size % 2 == 0) {
                for (int i = 0; i < size; i++) {
                    TreeNode current = queue.remove();
                    level.add(current.value);

                    if (current.left != null)
                        queue.add(current.left);
                    if (current.right != null)
                        queue.add(current.right);
                }
            }
            else{
                for (int i = 0; i < size; i++) {
                    TreeNode current = queue.remove();
                    level.add(current.value);

                    if (current.right != null)
                        queue.add(current.right);
                    if (current.left != null)
                        queue.add(current.left);
                }
            }
            result.add(level);
        }
        return result;
    }
}
