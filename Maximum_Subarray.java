package TheDailyByte_12_week;
import java.util.*;


public class Maximum_Subarray {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{-3,8,-8,2}));
        System.out.println(solve(new int[]{2, 3,-4, 2}));
        System.out.println(solve(new int[]{1, 5,-2, -3, 7}));
    }

    private static int solve(int[] nums) {
        int max = nums[0];
        int result = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            max = Math.max(nums[i], max + nums[i]);
            result = Math.max(result, max);
        }
        return result;
    }
}
