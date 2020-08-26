package TheDailyByte_12_week;

import java.util.*;

public class String_Permutations {

    public static void main(String[] args) {

        System.out.println(permutations("c7w2"));

    }

    private static List<String> permutations(String s) {
        List<String> collection = new ArrayList<>();
        char[] array = s.toCharArray();

        helper(array, collection, 0);

        return collection;
    }

    private static void helper(char[] array, List<String> result, int pos) {

        if(array.length == pos){
            result.add(new String(array));
            return;
        }

         if(array[pos] >= 0 && array[pos] <= '9'){
            helper(array, result, pos + 1);
            return;
         }

         array[pos] = Character.toLowerCase(array[pos]);
        helper(array, result, pos + 1);

        array[pos] = Character.toUpperCase(array[pos]);
        helper(array, result, pos + 1);
    }

}
