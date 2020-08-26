package TheDailyByte.Trees;

public class Symmetrical_Tree {

    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(2);
        tree1.left = new TreeNode(1);
        tree1.right = new TreeNode(1);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(5);
        tree2.right = new TreeNode(5);
        tree2.left.right = new TreeNode(7);
        tree2.right.right = new TreeNode(7);

        System.out.println(isSymmetricalBST(tree1));
        System.out.println(isSymmetricalBST(tree2));

    }

    private static boolean isSymmetricalBST(TreeNode root) {

        if(root == null) return true;

        return symmetric(root.left, root.right);
    }

    private static boolean symmetric(TreeNode left, TreeNode right) {

        if(left == null || right == null)
            return left == right;

        if(left.value != right.value)
            return false;

        return symmetric(left.left, right.right);
    }

}
