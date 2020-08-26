package TheDailyByte_12_week;
import java.util.*;
public class Valid_Anagram {

	public static void main(String[] args) {

		String str1 = "malayalam";
		String str2 = "mallayaam";
		
		System.out.println(validanagram(str1, str2));
		
	}

	private static Boolean validanagram(String str1, String str2) {
		
		if(str1.length() != str2.length()) return false;
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < str1.length() ; i++)
            map.put(str1.charAt(i),map.getOrDefault(str1.charAt(i), 0) + 1);
        
        for(int i = 0 ; i < str2.length() ; i++)
            map.put(str2.charAt(i),map.getOrDefault(str2.charAt(i), 0) + 1);
        
        for(Character c : map.keySet()){
            if(map.get(c) != 2 && map.get(c) % 2 != 0) return false;
        }
        
        return true;
	}

}
