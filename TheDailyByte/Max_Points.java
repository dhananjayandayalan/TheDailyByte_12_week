package TheDailyByte;

import java.util.*;

public class Max_Points {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{100, 200, 300}, 150));
        System.out.println(solve(new int[]{100, 200, 300, 400}, 200));
        System.out.println(solve(new int[]{300}, 200));
    }

    private static int solve(int[] coins, int E) {
    	int count = 0;
    	int val = E;
    	for(int i = 0 ; i < coins.length ; i++) {
    		if(val == 0) {
    			val += coins[i];
    		}
    		if(val >= coins[i]) {
    			coins[i] = coins[i] + (val - coins[i]);
    			count++;
    			val = E + (val - coins[i]);
    		}
    	}
    	return count;
    }
        
}
