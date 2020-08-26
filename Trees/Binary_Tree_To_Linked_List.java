package TheDailyByte.Trees;

public class Binary_Tree_To_Linked_List {
   // static TreeNode head = null;
    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(5);
        tree1.left = new TreeNode(1);
        tree1.right = new TreeNode(6);

        TreeNode tree2 = new TreeNode(5);
        tree2.right = new TreeNode(9);
        tree2.left = new TreeNode(2);
        tree2.left.left = new TreeNode(1);
        tree2.left.right = new TreeNode(3);

        TreeNode tree3 = new TreeNode(5);
        tree3.right = new TreeNode(6);

        TreeNode result1 = treeToLL(tree1);
        TreeNode result2 = treeToLL(tree2);
        TreeNode result3 = treeToLL(tree3);

        while(result1 != null){
            System.out.print(result1.value + "->");
            result1 = result1.right;
        }
        System.out.print("null");
        System.out.println();

        while(result2 != null){
            System.out.print(result2.value + "->");
            result2 = result2.right;
        }
        System.out.print("null");
        System.out.println();

        while(result3 != null){
            System.out.print(result3.value + "->");
            result3 = result3.right;
        }
        System.out.print("null");

    }
    private static TreeNode treeToLL(TreeNode root) {
        TreeNode dummy = new TreeNode(-1);
        TreeNode head = dummy;
        helper(root, head);
        return dummy.right;
    }

    private static TreeNode helper(TreeNode root, TreeNode head) {
        if(root != null) {
            head = helper(root.left, head);
            head.right = new TreeNode(root.value);
            head = head.right;
            head = helper(root.right, head);
        }
        return head;
    }
}