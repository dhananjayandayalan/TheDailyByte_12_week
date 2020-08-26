package TheDailyByte_12_week;

import java.util.*;

public class Generate_Text_Message {

    public static void main(String[] args) {

        System.out.println(text_message("23"));

    }

    private static List<String> text_message(String digits) {

        List<String> collection = new ArrayList<>();
        if(digits == null || digits.length() == 0)
            return collection;

        String[] map = {
                " ",
                " ",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };

        helper(collection, digits, "", 0, map);
        return collection;
    }

    private static void helper(List<String> result, String digits, String current, int index, String[] map) {

        if(index == digits.length()){
            result.add(current);
            return;
        }

        String letter = map[digits.charAt(index) - '0'];

        for(int i = 0 ; i < letter.length() ; i++)
            helper(result, digits, current + letter.charAt(i), index + 1, map);

    }

}
