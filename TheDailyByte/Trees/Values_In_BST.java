package TheDailyByte.Trees;

public class Values_In_BST {

    public static void main(String[] args) {
        
        TreeNode node1 = new TreeNode(3);
        node1.left = new TreeNode(1);
        node1.right = new TreeNode(4);
        
        TreeNode node2 = new TreeNode(7);
        node2.left = new TreeNode(5);
        node2.right = new TreeNode(9);
        node2.right.left = new TreeNode(2);
        node2.right.right = new TreeNode(6);

        TreeNode node3 = new TreeNode(8);
        node3.left = new TreeNode(6);
        node3.right = new TreeNode(9);

        TreeNode result1 = contains(node1, 1);
        TreeNode result2 = contains(node2, 9);
        TreeNode result3 = contains(node3, 7);

        System.out.println(result1 != null ? result1.getValue() : null);
        System.out.println(result2 != null ? result2.getValue() : null);
        System.out.println(result3 != null ? result3.getValue() : null);


    }

    private static TreeNode contains(TreeNode root, int val) {

        if (root == null) return null;
        if (root.value == val) return root;

           if (val < root.value)
               return contains(root.left, val);
           else
               return contains(root.right, val);
       }
    }

