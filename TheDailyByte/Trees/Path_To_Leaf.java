package TheDailyByte.Trees;

import java.util.*;

public class Path_To_Leaf {

    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(8);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(29);
        tree2.right.left = new TreeNode(3);
        tree2.right.right = new TreeNode(9);

        System.out.println(pathtoleaf(tree1));
        System.out.println(pathtoleaf(tree2));

    }

    private static List<String> pathtoleaf(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if(root == null) return paths;

        dfs(root, "", paths);

        return paths;
    }

    private static void dfs(TreeNode root, String path, List<String> paths) {

        path += root.value;

        if(root.left == null && root.right == null){
            paths.add(path);
            return;
        }
        if(root.left != null)
            dfs(root.left, path + "->", paths);
        if(root.right != null)
            dfs(root.right, path + "->", paths);

    }

}
