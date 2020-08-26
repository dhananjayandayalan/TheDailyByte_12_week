package TheDailyByte;
import java.util.*;

public class Message_Decryption {
    public static void main(String[] args) {
        System.out.println(solve("23"));
        System.out.println(solve("1234"));
    }

    public static int solve(String s){
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for(int i = 2 ; i <= s.length() ; i++){
            int one = Integer.valueOf(s.substring(i - 1, i));
            int two = Integer.valueOf(s.substring(i - 2, i));
            if(one >= 1){
                dp[i] += dp[i - 1];
            }
            if(two >= 10 && two <= 26){
                dp[i] += dp[i - 2];
            }

        }
        return dp[s.length()];
    }

}
