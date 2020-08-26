package TheDailyByte.Trees;

public class Identical_Trees {

    public static void main(String[] args) {

        TreeNode tree1_node1 = new TreeNode(2);
        tree1_node1.left = new TreeNode(1);
        tree1_node1.right = new TreeNode(3);
        TreeNode tree1_node2 = new TreeNode(2);
        tree1_node2.left = new TreeNode(1);
        tree1_node2.right = new TreeNode(3);

        TreeNode tree2_node1 = new TreeNode(1);
        tree2_node1.right = new TreeNode(9);
        tree2_node1.right.right = new TreeNode(18);
        TreeNode tree2_node2 = new TreeNode(1);
        tree2_node2.left = new TreeNode(9);
        tree2_node2.left.right = new TreeNode(18);

        TreeNode tree3_node1 = new TreeNode(2);
        tree3_node1.left = new TreeNode(3);
        tree3_node1.right = new TreeNode(1);
        TreeNode tree3_node2 = new TreeNode(2);
        tree3_node2.left = new TreeNode(1);
        tree3_node2.right = new TreeNode(3);

        System.out.println(identical(tree1_node1, tree1_node2));
        System.out.println(identical(tree2_node1, tree2_node2));
        System.out.println(identical(tree3_node1, tree3_node2));

    }

    private static boolean identical(TreeNode tree1, TreeNode tree2){
        if(tree1 == null && tree2 == null)
            return true;
        if((tree1 == null && tree2 != null) || (tree1 != null && tree2 == null))
            return false;
        return ((tree1.value == tree2.value) && identical(tree1.right, tree2.right) && identical(tree1.left, tree2.left));
    }

}

