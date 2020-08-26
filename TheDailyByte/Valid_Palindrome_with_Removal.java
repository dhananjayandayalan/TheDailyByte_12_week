package TheDailyByte;

public class Valid_Palindrome_with_Removal {
	
	public static void main(String[] args) {
		
		String str = "abccbra";
		
		Boolean result = solve(str);
		
		System.out.println(result);
		
	}

	private static Boolean solve(String str) {
		
		boolean result = false;
		
		int i = 0;
		
		while(i < str.length()) {
			StringBuffer sb = new StringBuffer(str);
			sb.deleteCharAt(i);
			StringBuffer rev = new StringBuffer(sb.toString()).reverse();
			if(rev.toString().equals(sb.toString())) {
				result = true;
					break;
			}
			i++;
		}
		
		return result;
	}

}
