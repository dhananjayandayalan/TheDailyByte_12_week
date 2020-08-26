package TheDailyByte;
import java.util.*;
public class Spot_The_Difference {

	public static void main(String[] args) {
		
		String string1 = "coding";
		String string2 = "ingcod";
		
		System.out.println(spotthedifference(string1, string2));
		
		
	}

	private static String spotthedifference(String string1, String string2) {
		
		Map<Character, Integer> map = new HashMap<>();
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < string1.length() ; i++) 
			map.put(string1.charAt(i), map.getOrDefault(string1.charAt(i), 0) + 1);
		
		for(int i = 0 ; i < string2.length() ; i++) {
			if(!map.containsKey(string2.charAt(i))) {
				sb.append(string2.charAt(i));
			}
		}
		
		return sb.toString();
	}

}
