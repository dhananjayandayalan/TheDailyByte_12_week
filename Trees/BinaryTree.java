package TheDailyByte.Trees;

import java.util.Scanner;

public class BinaryTree {

    private TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(TreeNode root){
        this.root = root;
    }

    public Boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private TreeNode insert(TreeNode node, int value) {
        if (node == null)
            node = new TreeNode(value);
        else {
            if (node.getRight() == null)
                node.right = insert(node.right, value);
            else
                node.left = insert(node.left, value);
        }
        return node;
    }

    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(TreeNode node) {
        if (node == null)
            return 0;
        else {
            int length = 1;
            length += countNodes(node.getLeft());
            length += countNodes(node.getRight());
            return length;
        }
    }

    public boolean search(int value) {
        return search(root, value);
    }

    private boolean search(TreeNode node, int value) {
        try {
            if (node.getValue() == value)
                return true;
            if (node.getLeft() != null)
                if (search(node.getLeft(), value))
                    return true;
            if (node.getRight() != null)
                if (search(node.getRight(), value))
                    return true;
            return false;
        }
        catch (Exception e){
            return false;
        }
    }

    public void inorder() {
        inorder(root);
    }

    public void preorder() {
        preorder(root);
    }

    public void postorder() {
        postorder(root);
    }

    private static void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.getLeft());
            System.out.print(node.getValue() + " ");
            inorder(node.getRight());
        }

    }

    private static void preorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.getValue() + " ");
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    private static void postorder(TreeNode node) {
        if (node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.print(node.getValue() + " ");
        }

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scan = new Scanner(System.in);

        System.out.println("Binary Tree Test\n");
        char ch;
        do
        {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");

            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter integer element to insert");
                    tree.insert(scan.nextInt());
                    break;
                case 2 :
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result : "+ tree.search(scan.nextInt()));
                    break;
                case 3 :
                    System.out.println("Nodes = "+ tree.countNodes());
                    break;
                case 4 :
                    System.out.println("Empty status = "+ tree.isEmpty());
                    break;
                case 5:
                    System.out.print("\nPost order : ");
                    tree.postorder();
                    System.out.print("\nPre order : ");
                    tree.preorder();
                    System.out.print("\nIn order : ");
                    tree.inorder();
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /*  Display tree  */


            System.out.println("\n\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}
