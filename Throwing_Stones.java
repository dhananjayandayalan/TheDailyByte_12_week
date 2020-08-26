package TheDailyByte_12_week;

import java.util.*;

public class Throwing_Stones {

	public static void main(String[] args) {
		System.out.println(solve(new int[] {2, 4, 3, 8}));
		System.out.println(solve(new int[] {1, 2, 3, 4}));
	}

	private static int solve(int[] stones) {
		
		Arrays.sort(stones);
		
		int sum = 0;
		for(int i : stones)
			sum += i;
		
		boolean[][] visited = new boolean[sum][stones.length + 1];
		
		for(int i = 0 ; i <= stones.length ; ++i) 
			visited[0][i] = true;
		
		int max = 0;
		
		for(int i = 0 ; i <= sum / 2 ; i++) {
			for(int j = 1 ; j <= stones.length ; j++) {
				visited[i][j] = visited[i][j - 1];
				if(i >= stones[j - 1]) {
					visited[i][j] = visited[i - stones[j - 1]][j - 1] || visited[i][j - 1];
					if(visited[i][j]) 
						max = Math.max(i, max);
				}
			}
		}
		
		return sum - 2 * max;
	}

}
