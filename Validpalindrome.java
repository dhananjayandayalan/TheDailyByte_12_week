package TheDailyByte_12_week;

public class Validpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "A Man, A Plan, A Canal-Panama!";
		
		Boolean isPalin = isPalindrome(s);
		
		System.out.println(isPalin);
	}

	private static Boolean isPalindrome(String str) {
		
		// Approach 1  
		// time -> O(N) space -> O(N)
		
		/*
		if(str == null) return false;
		else {
		
		String s = str.replaceAll("[^a-zA-Z]+", " ");
		
		char[] chararray = s.toCharArray();
		
		for(int i = 0 ; i < chararray.length ; i++) {
			if(Character.isUpperCase(chararray[i])) 
				chararray[i] = Character.toLowerCase(chararray[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(char i : chararray) {
			if(i != ' ' && i != '\t') 
				sb.append(i);
		}
		
		String st = sb.toString();
		String rev = sb.reverse().toString();
		
		return st.equals(rev) ? true : false;
		
		*/
		

		// Approach 2  
		// time -> O(N) space -> O(1)
		
		
		 if(str == null){
		        return false;
		    }
		 
		    str = str.toLowerCase();
		 
		    int i = 0;
		    int j = str.length()-1;
		 
		    while(i<j){
		        while(i<j && !((str.charAt(i)>='a' && str.charAt(i)<='z') 
		                    || (str.charAt(i)>='0' && str.charAt(i)<='9'))){
		            i++;
		        }
		 
		        while(i<j && !((str.charAt(j)>='a' && str.charAt(j)<='z') 
		                    || (str.charAt(j)>='0' && str.charAt(j)<='9'))){
		            j--;
		        }
		 
		        if(str.charAt(i) != str.charAt(j)){
		            return false;
		        }
		 
		        i++;
		        j--;
		    }
		    return true;
		}
	}


