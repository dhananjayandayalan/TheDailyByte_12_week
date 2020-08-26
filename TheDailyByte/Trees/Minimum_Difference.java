package TheDailyByte.Trees;

public class Minimum_Difference {

    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(2);
        tree1.left = new TreeNode(1);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(29);
        tree2.left = new TreeNode(17);
        tree2.left.left = new TreeNode(1);
        tree2.right = new TreeNode(50);
        tree2.right.left = new TreeNode(42);
        tree2.right.right = new TreeNode(59);

        TreeNode tree3 = new TreeNode(2);
        tree3.right = new TreeNode(100);

        System.out.println(mindiff(tree1));
        pre = null;
        min = Integer.MAX_VALUE;
        System.out.println(mindiff(tree2));
        pre = null;
        min = Integer.MAX_VALUE;
        System.out.println(mindiff(tree3));

    }

    static int min = Integer.MAX_VALUE;
    static TreeNode pre = null;
    private static int mindiff(TreeNode tree) {
        dfs(tree);
        return min;
    }

    private static void dfs(TreeNode tree) {

        if(tree == null) return;
        dfs(tree.left);
        if(pre != null) min = Math.abs(Math.min(tree.value - pre.value, min));
        pre = tree;
        dfs(tree.right);
    }

}
