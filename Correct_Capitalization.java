package TheDailyByte_12_week;

public class Correct_Capitalization {

	public static void main(String[] args) {
		
		String input = "USA";
		Boolean result = correct_capitalization(input);
		System.out.println(result);
		
	}
	
	// Time Complexity -> O(N) (Linear Time)
	// Space Complexity - O(1) (constant space)

	private static Boolean correct_capitalization(String input) {
		
		int k = 0;
		
		if(Character.isUpperCase(input.charAt(k))) {
			k += 1;
				if(Character.isUpperCase(input.charAt(k))) {
					while(k < input.length() - 1) {
						if(Character.isUpperCase(input.charAt(k + 1))) {
							k++;
						}
						else {
							return false;
						}
					}
				}
				else if(Character.isLowerCase(input.charAt(k))) {
					while(k < input.length() - 1) {
						if(Character.isLowerCase(input.charAt(k + 1))) {
							k++;
						}
						else {
							return false;
						}
					}
				}
			
			return true;
		}
		else {
			while(k < input.length() - 1) {
				if(Character.isLowerCase(input.charAt(k + 1))) {
					k++;
				}
				else {
					return false;
				}
			}
			return true;
		}
	
	}
		
}
	

