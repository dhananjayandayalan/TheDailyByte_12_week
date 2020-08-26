package TheDailyByte.Trees;

public class Calculate_Depth {

    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(9);
        tree1.left = new TreeNode(1);
        tree1.right = new TreeNode(2);

        TreeNode tree2 = new TreeNode(5);
        tree2.left = new TreeNode(1);
        tree2.right = new TreeNode(29);
        tree2.right.left = new TreeNode(4);
        tree2.right.right = new TreeNode(13);

        System.out.println(depth(tree1));
        System.out.println(depth(tree2));

    }

    private static int depth(TreeNode root) {

        if(root == null) return 0;

        int left = depth(root.left);
        int right = depth(root.right);

        return Math.max(left, right) + 1;
    }

}
