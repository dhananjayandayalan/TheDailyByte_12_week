package TheDailyByte.Trees;

import java.util.*;

public class Gather_Levels_N_Ary_Tree {

    public static void main(String[] args) {

        Tree_Node tree1 = new Tree_Node(8);
        tree1.children.add(new Tree_Node(2));
        tree1.children.add(new Tree_Node(3));
        tree1.children.add(new Tree_Node(29));

        Tree_Node tree2 = new Tree_Node(2);
        tree2.children.add(new Tree_Node(1));
        tree2.children.add(new Tree_Node(6));
        tree2.children.add(new Tree_Node(9));
        tree2.children.get(0).children.add(new Tree_Node(8));
        tree2.children.get(1).children.add(new Tree_Node(2));
        tree2.children.get(2).children.add(new Tree_Node(2));
        tree2.children.get(1).children.get(0).children.add(new Tree_Node(19));
        tree2.children.get(1).children.get(0).children.add(new Tree_Node(12));
        tree2.children.get(1).children.get(0).children.add(new Tree_Node(90));

        System.out.println(levelorder(tree1));
        System.out.println(levelorder(tree2));


    }

    private static List<List<Integer>> levelorder(Tree_Node root) {
        List<List<Integer>> res = new ArrayList();
        if (root == null) return res;
        Queue<Tree_Node> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> innerList = new ArrayList();
            int size = queue.size();
            for(int i = 0 ; i < size ; i++) {
                Tree_Node current = queue.poll();
                if (current.children != null) {
                    List<Tree_Node> current_children = current.children;
                    for (Tree_Node node : current_children) {
                        queue.add(node);
                    }
                }
                innerList.add(current.value);
            }
            res.add(innerList);
        }
        return res;
    }

}
