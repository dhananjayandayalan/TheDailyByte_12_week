package TheDailyByte_12_week;

import java.util.*;

public class Unique_Combinations {

    public static void main(String[] args) {

        System.out.println(combinations(new int[]{2, 4, 6, 3}, 6));

    }

    private static List<List<Integer>> combinations(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        if(nums == null || nums.length == 0) return result;
        bt(nums, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void bt(int[] nums, int target, int index, ArrayList<Integer> current, List<List<Integer>> result) {

        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }else if(target < 0)
            return;

        for(int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            bt(nums, target - nums[i], i, current, result);
            current.remove(current.size() - 1);
        }

    }

}
