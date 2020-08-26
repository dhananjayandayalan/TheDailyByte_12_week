package TheDailyByte;

import java.util.*;

public class Paranthesis_Generation {

    public static void main(String[] args) {

        System.out.println(paranthesis_generation(4));

    }

    private static List<String> paranthesis_generation(int val) {
        List<String> result = new ArrayList<>();
        bt(result, "", 0, 0, val);
        return result;
    }

    private static void bt(List<String> result, String s, int open, int close, int val) {

        if(s.length() == val * 2){
            result.add(s);
            return;
        }
        if(open < val)
            bt(result, s+"(", open + 1, close, val);
        if(close < open)
            bt(result, s+")", open, close + 1, val);

    }


}
