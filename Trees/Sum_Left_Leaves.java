package TheDailyByte.Trees;

public class Sum_Left_Leaves {

    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(5);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(12);
        tree1.right.left = new TreeNode(3);
        tree1.right.right = new TreeNode(8);

        TreeNode tree2 = new TreeNode(2);
        tree2.left = new TreeNode(4);
        tree2.right = new TreeNode(2);
        tree2.left.left = new TreeNode(3);
        tree2.left.right = new TreeNode(9);

        System.out.println(sum_left(tree1));
        System.out.println(sum_left(tree2));
    }

    private static int sum_left(TreeNode root) {
        if(root == null)
            return 0;
        else
            if(root.left != null && root.left.left == null && root.left.right == null)
                return root.left.value + sum_left(root.right);
            else
                return sum_left(root.left) + sum_left(root.right);
    }

}
