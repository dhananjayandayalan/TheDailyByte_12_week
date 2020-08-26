package TheDailyByte;

import java.util.HashSet;
import java.util.Set;

public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {4, 2, 6, 5, 2};
		int target = 4;
		
		System.out.println(twosum(array, target));
		
	}

	private static Boolean twosum(int[] array, int target) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0 ; i < array.length ; i++) {
			
			if(set.contains(array[i]))
				return true;
			
			set.add(target - array[i]);
		}
		
		return false;
	}

}
