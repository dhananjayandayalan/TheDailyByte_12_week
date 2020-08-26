package TheDailyByte_12_week;

import java.util.*;

public class Remove_Adjacent_Duplicates {

    public static void main(String[] args) {

        System.out.println(removeadjacentduplicates("abccba"));
        System.out.println(removeadjacentduplicates("foobar"));
        System.out.println(removeadjacentduplicates("abccbefggfe"));

    }

    private static String removeadjacentduplicates(String s) {

        if(s.length() < 2) return s;

        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){

            char c = s.charAt(i);

            if(stack.isEmpty())
                stack.push(c);
            else if(c == stack.peek())
                stack.pop();
            else
                stack.push(c);

        }
        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()){
            sb.append(stack.peek());
            stack.pop();
        }

        return sb.reverse().toString().trim();
    }

}
