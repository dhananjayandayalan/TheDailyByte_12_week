package TheDailyByte_12_week;

import java.util.*;

public class Uncommon_Words {

    public static void main(String[] args){

        String sentence1 =  "the tortoise beat the haire";
        String sentence2 =  "the tortoise lost to the haire";
        System.out.println(uncommon_words(sentence1, sentence2));

    }

    private static List<String> uncommon_words(String sentence1, String sentence2) {

        String[] str1 = sentence1.split(" ");
        String[] str2 = sentence2.split(" ");

        Map<String, Integer> map = new HashMap<>();

        List<String> result = new ArrayList<>();

        for(int i = 0 ; i < str1.length ; i++)
            map.put(str1[i], map.getOrDefault(str1[i], 0) + 1);

        for(int i = 0 ; i < str2.length ; i++)
            map.put(str2[i], map.getOrDefault(str2[i], 0) + 1);

        for(String s : map.keySet()){
            if(map.get(s) == 1) result.add(s);
        }

        return result;
    }

}
