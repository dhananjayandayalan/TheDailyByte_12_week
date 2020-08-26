package TheDailyByte;
import java.util.*;

public class Valid_Paranthesis {

    public static void main(String[] args) {

        String paranthesis = "((((({{[]}})))))";

        System.out.println(validparanthesis(paranthesis));

    }

    private static boolean validparanthesis(String s) {

        if(s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' ||c == '{')
                stack.push(c);
            else if(c == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
        }

        return stack.isEmpty();
    }

}
