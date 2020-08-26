package TheDailyByte;

public class Longest_Common_Prefix {
	
	public static void main(String[] args) {
		
		String[] strarray = {"spot", "spotted", "spotify"};
		
		System.out.println(longest_common_prefix(strarray));
		
	}

	private static String longest_common_prefix(String[] strarray) {
		
			
		if(strarray.length == 0 || strarray == null) return "";
		
		String prefix = strarray[0];
		for(int i = 1 ; i < strarray.length ; i++) {
			while(strarray[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
			
		}
		
		return prefix;
	}
	

}
