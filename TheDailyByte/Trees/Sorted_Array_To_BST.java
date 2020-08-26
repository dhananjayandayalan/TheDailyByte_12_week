package TheDailyByte.Trees;

public class Sorted_Array_To_BST {

    public static void main(String[] args) {
        int[] matrix1 = {1,2,3};
        int[] matrix2 = {1,2,3,4,5,6};

        TreeNode result1 = solve(matrix1);
        TreeNode result2 = solve(matrix2);
    }

    private static TreeNode solve(int[] nums) {

        if(nums.length == 0) return null;
        return treetoarray(nums, 0, nums.length - 1);

    }

    private static TreeNode treetoarray(int[] nums, int i, int j) {
        if(i > j) return null;
        int mid = i + (j - i) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = treetoarray(nums, i , mid - 1);
        node.right = treetoarray(nums, mid + 1, j);

        return node;
    }

}
