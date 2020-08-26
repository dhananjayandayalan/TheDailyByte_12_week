package TheDailyByte.Trees;

import java.util.ArrayList;
import java.util.List;

public class Find_The_Mode {


    public static void main(String[] args) {

        TreeNode tree = new TreeNode(2);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(2);

        /*
        TreeNode tree = new TreeNode(7);
        tree.left = new TreeNode(4);
        tree.right = new TreeNode(9);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(4);
        tree.left.right.right = new TreeNode(4);
        tree.right.left = new TreeNode(8);
        tree.right.right = new TreeNode(9);
        tree.right.right.right = new TreeNode(9);
         */

        int[] result = findmode(tree);
        System.out.print("[");
        if(result.length == 1){
            System.out.print(result[0]);
        }else {
            for(int i = 0 ; i < result.length - 1 ; i++)
                System.out.print(result[i] + ", ");
            System.out.print(result[result.length - 1]);
        }
        System.out.print("]");

    }
    static Integer prev = null;
    static int count = 1;
    static int max = 0;
    private static int[] findmode(TreeNode root) {

        if(root == null) return new int[] {-1};

        List<Integer> modes = new ArrayList<>();

        traverse(root, modes);

        int[] result = new int[modes.size()];
        for(int i = 0 ; i < modes.size() ; i++)
            result[i] = modes.get(i);

        return result;
    }

    private static void traverse(TreeNode node, List<Integer> modes) {
        if(node == null)
            return;

        traverse(node.left, modes);

        if(prev != null){
            if(prev == node.value){
                count++;
            }
            else{
                count = 1;
            }
        }

        if(count > max){
            max = count;
            modes.clear();
            modes.add(node.value);
        }else if(count == max){
            modes.add(node.value);
        }

        prev = node.value;

        traverse(node.right, modes);

    }

}
