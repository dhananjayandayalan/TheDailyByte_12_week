package TheDailyByte;
import java.util.*;
public class First_Unique_Character {

	public static void main(String[] args) {
		
		String str = "abcde";
		
		System.out.println(first_unique_character(str));

	}

	private static int first_unique_character(String str) {
		
		if(str == null||str.length() == 0) return -1;
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < str.length() ; i++)
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		
		for(int i = 0 ; i < str.length() ; i++) 
			if(map.get(str.charAt(i)) == 1) 
				return i;	

	  return -1;
	}
}
