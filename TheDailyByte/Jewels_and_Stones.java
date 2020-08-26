package TheDailyByte;

import java.util.*;

public class Jewels_and_Stones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jewels = "abc";
		String stones = "ac";
		
		int result = numberofstones(jewels, stones);
		
		System.out.println(result);

	}

	private static int numberofstones(String jewels, String stones) {
		
		int count = 0;
		
		Map<Character, Integer> jewel = new HashMap<>();
		Map<Character, Integer> stone = new HashMap<>();
		
		for(int i = 0 ; i < jewels.length() ; i++) 
			jewel.put(jewels.charAt(i), jewel.getOrDefault(jewels.charAt(i), 0) + 1);
		
		for(int i = 0 ; i < stones.length() ; i++) 
			stone.put(stones.charAt(i), stone.getOrDefault(stones.charAt(i), 0) + 1);
		
		for(Character c : stone.keySet()) {
			if(jewel.containsKey(c) == true)
				count += jewel.get(c);
		}
		
		return count;
	}

}
