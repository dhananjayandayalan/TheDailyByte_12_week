package TheDailyByte.Trees;

public class Root_To_Leaf_Path_Sum {

    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(5);
        tree1.right = new TreeNode(2);
        tree1.left.left = new TreeNode(1);
        tree1.right.left = new TreeNode(12);
        tree1.right.right = new TreeNode(29);

        TreeNode tree2 = new TreeNode(104);
        tree2.left = new TreeNode(39);
        tree2.right = new TreeNode(31);
        tree2.left.left = new TreeNode(32);
        tree2.left.right = new TreeNode(1);
        tree2.right.left = new TreeNode(9);
        tree2.right.right = new TreeNode(10);

        System.out.println(leafsum(tree1, 15));
        System.out.println(leafsum(tree2, 175));

    }

    private static boolean leafsum(TreeNode root, int n) {

        if(root == null) return false;
        else if(root.left == null && root.right == null && n - root.value == 0)
            return true;
        else
            return leafsum(root.left, n - root.value) || leafsum(root.right, n - root.value);
    }

}

