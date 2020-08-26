package TheDailyByte.Trees;

public class Validate_Tree {

    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(2);
        tree2.left = new TreeNode(1);
        tree2.right = new TreeNode(3);

        System.out.println(validate_tree(tree1));
        System.out.println(validate_tree(tree2));

    }

    public static boolean validate_tree(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validate(TreeNode node, long min, long max){
        if(node==null) return true;
        if(min>=node.value || node.value>=max) return false;
        return validate(node.left, min, node.value) && validate(node.right, node.value, max);
    }

}
