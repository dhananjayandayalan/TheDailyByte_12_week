package TheDailyByte.Trees;

public class TreeNode {

    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value){
        this.value = value;
        left = null;
        right = null;
    }

    public TreeNode(){
        value = -1;
    }

    public void setLeft(TreeNode node){
        left = node;
    }

    public void setRight(TreeNode node){
        right = node;
    }

    public TreeNode getLeft(){
        return left;
    }

    public TreeNode getRight(){
        return right;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

}
