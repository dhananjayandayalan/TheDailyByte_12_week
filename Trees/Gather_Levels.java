package TheDailyByte.Trees;

import java.util.*;

public class Gather_Levels {
    
    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(4);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(7);


        TreeNode tree2 = new TreeNode(2);
        tree2.left = new TreeNode(10);
        tree2.right = new TreeNode(15);
        tree2.right.right = new TreeNode(20);


        TreeNode tree3 = new TreeNode(1);
        tree3.left = new TreeNode(9);
        tree3.left.left = new TreeNode(3);
        tree3.right = new TreeNode(32);
        tree3.right.right = new TreeNode(78);


        System.out.println(levelorder(tree1));
        System.out.println(levelorder(tree2));
        System.out.println(levelorder(tree3));
    }

    private static List<List<Integer>> levelorder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> levels = new ArrayList<>();
            for(int i = 0 ; i < size ; i++){
                TreeNode node = queue.pop();
                levels.add(node.value);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            result.add(levels);
        }

        return result;
    }
}