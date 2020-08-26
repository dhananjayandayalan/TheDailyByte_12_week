package TheDailyByte;

public class Add_Binary {

	public static void main(String[] args) {
		
		String binary = "10101";
		String addbit = "1101";
		System.out.println(addbinary(binary, addbit));

	}

	 public static String addbinary(String a, String b) {
	        
	        StringBuilder sb =new StringBuilder();
	        
	        int val1 = a.length() - 1;
	        int val2 = b.length() - 1;
	        int carry = 0;
	        
	        while(val1 >= 0 || val2 >= 0){    
	            int sum = carry;
	            
	            if(val1 >= 0) sum += a.charAt(val1) - '0';
	            if(val2 >= 0) sum += b.charAt(val2) - '0';
	            sb.append(sum % 2);
	            carry = sum / 2;
	            val1--;
	            val2--;
	            
	        }
	        
	        if(carry != 0) sb.append(carry);
	        return sb.reverse().toString();
	    }


}
