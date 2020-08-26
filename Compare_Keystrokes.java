package TheDailyByte_12_week;

import java.util.*;

public class Compare_Keystrokes {

    public static void main(String[] args) {
        System.out.println(compare_key_strokes("ABC#", "AB"));
        System.out.println(compare_key_strokes("como#pur#ter", "computer"));
        System.out.println(compare_key_strokes("cof#dim#ng", "code"));
    }

    private static boolean compare_key_strokes(String s, String t) {

        Stack<Character> stack = new Stack<>();

        for(char c : t.toCharArray())
            stack.push(c);
        int i = s.length() - 1;
        while(i >= 0){
            if(s.charAt(i) == '#')
                i = i - 2;
            else if(!stack.isEmpty() && stack.peek() == s.charAt(i)){
                stack.pop();
                i--;
            }
            else i--;
        }
        return stack.isEmpty();
    }

}
