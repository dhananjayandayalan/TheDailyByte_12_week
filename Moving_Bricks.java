package TheDailyByte_12_week;

import java.util.*;

public class Moving_Bricks {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1000, 1000, 1000, 2000}));
        System.out.println(solve(new int[]{1000, 200, 150, 200}));
    }

    private static int solve(int[] brick) {
        Integer[] bricks = new Integer[brick.length];
        int k = 0;
        for(int i : brick)
            bricks[k++] = i;

        Arrays.sort(bricks, Collections.reverseOrder());
        int sum = 0;
        int j = 0;
        for(Integer i : bricks){
            if(sum + i < 5000){
                sum += i;
                j++;
            }
        }
        return j;
    }
}
