package TheDailyByte.Trees;

import java.util.*;

public class Gather_Columns {

    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(8);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(29);
        tree1.right.left = new TreeNode(3);
        tree1.right.right = new TreeNode(9);
        
        TreeNode tree2 = new TreeNode(100);
        tree2.left = new TreeNode(53);
        tree2.right = new TreeNode(78);
        tree2.left.left = new TreeNode(32);
        tree2.left.right = new TreeNode(3);
        tree2.right.left = new TreeNode(9);
        tree2.right.right = new TreeNode(20);
        
        System.out.println(gathercolumns(tree1));
        System.out.println(gathercolumns(tree2));

    }

    private static List<List<Integer>> gathercolumns(TreeNode root) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        helper(root, map);
        List<List<Integer>> result = new ArrayList<>();
        result.addAll(map.values());
        return result;
    }

    private static void helper(TreeNode root, TreeMap<Integer, ArrayList<Integer>> map) {

        if (root == null) {
            return;
        }

        LinkedList<TreeNode> q1 = new LinkedList<>();
        LinkedList<Integer> q2 = new LinkedList<>();

        q1.offer(root);
        q2.offer(0);

        while (!q1.isEmpty()) {
            TreeNode node = q1.poll();
            int order = q2.poll();

            //add to map
            ArrayList<Integer> list = map.get(order);
            if (list == null) {
                list = new ArrayList<>();
                map.put(order, list);
            }
            list.add(node.value);

            if (node.left != null) {
                q1.offer(node.left);
                q2.offer(order - 1);
            }

            if (node.right != null) {
                q1.offer(node.right);
                q2.offer(order + 1);
            }
        }

    }

}
