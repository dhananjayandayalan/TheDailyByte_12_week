package TheDailyByte.Trees;

public class Lowest_Common_Ancestor {

    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(7);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(9);
        tree1.left.left = new TreeNode(1);
        tree1.left.right = new TreeNode(5);

        TreeNode tree2 = new TreeNode(8);
        tree2.left = new TreeNode(3);
        tree2.right = new TreeNode(9);
        tree2.left.left = new TreeNode(2);
        tree2.left.right = new TreeNode(6);

        TreeNode tree3 = new TreeNode(8);
        tree3.left = new TreeNode(6);
        tree3.right = new TreeNode(9);

        System.out.println(lca(tree1, tree1.left.left, tree1.right).value);
        System.out.println(lca(tree2, tree2.left.left, tree2.left.right).value);
        System.out.println(lca(tree3, tree3.left, tree3).value);

    }

    private static TreeNode lca(TreeNode root, TreeNode a, TreeNode b) {

        if(a.value < root.value && b.value < root.value){
            return lca(root.left, a, b);
        }

        if(a.value > root.value && b.value > root.value){
            return lca(root.right, a, b);
        }

        return root;
    }

}
