package TheDailyByte.Trees;

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree(int value){
        root.value = value;
    }

    public BinarySearchTree(TreeNode root){
        this.root = root;
    }

    public BinarySearchTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    /* Functions to insert data */
    public void insert(int data) {
        root = insert(root, data);
    }

    /* Function to insert data recursively */
    private TreeNode insert(TreeNode node, int data) {
        if (node == null)
            node = new TreeNode(data);
        else {
            if (data <= node.getValue())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }

    /* Functions to delete data */
    public void delete(int k) {
        if (isEmpty())
            System.out.println("Tree Empty");
        else if (search(k) == false)
            System.out.println("Sorry " + k + " is not present");
        else {
            root = delete(root, k);
            System.out.println(k + " deleted from the tree");
        }
    }

    private TreeNode delete(TreeNode root, int k) {
        TreeNode p, p2, n;
        if (root.getValue() == k) {
            TreeNode lt, rt;
            lt = root.getLeft();
            rt = root.getRight();
            if (lt == null && rt == null)
                return null;
            else if (lt == null) {
                p = rt;
                return p;
            } else if (rt == null) {
                p = lt;
                return p;
            } else {
                p2 = rt;
                p = rt;
                while (p.getLeft() != null)
                    p = p.getLeft();
                p.setLeft(lt);
                return p2;
            }
        }
        if (k < root.getValue()) {
            n = delete(root.getLeft(), k);
            root.setLeft(n);
        } else {
            n = delete(root.getRight(), k);
            root.setRight(n);
        }
        return root;
    }

    /* Functions to count number of nodes */
    public int countNodes() {
        return countNodes(root);
    }

    /* Function to count number of nodes recursively */
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

    /* Functions to search for an element */
    public boolean search(int value) {
        return search(root, value);
    }

    /* Function to search for an element recursively */
    private boolean search(TreeNode node, int value) {
        boolean found = false;
        while ((node != null) && !found) {
            int rval = node.getValue();
            if (value < rval)
                node = node.getLeft();
            else if (value > rval)
                node = node.getRight();
            else {
                found = true;
                break;
            }
            found = search(node, value);
        }
        return found;
    }

    /* Function for inorder traversal */
    public void inorder() {
        inorder(root);
    }

    private void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.getLeft());
            System.out.print(node.getValue() + " ");
            inorder(node.getRight());
        }
    }

    /* Function for preorder traversal */
    public void preorder() {
        preorder(root);
    }

    private void preorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.getValue() + " ");
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    /* Function for postorder traversal */
    public void postorder() {
        postorder(root);
    }

    private void postorder(TreeNode node) {
        if (node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.print(node.getValue() + " ");
        }
    }

}
