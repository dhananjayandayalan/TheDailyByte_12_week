package TheDailyByte;
import java.util.*;
public class Intersection_Of_Number {


    public static void main(String[] args) {
        int[] num1 = {2, 4, 4, 2};
        int[] num2 = {2, 4};

        System.out.println(intersection(num1, num2));
    }

    private static List<Integer> intersection(int[] num1, int[] num2) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i : num1)
            map.put(i, map.getOrDefault(i, 0) + 1);

        List<Integer> result = new ArrayList<>();

        for(int i : num2){
            if(map.containsKey(i)){
                result.add(i);
                map.remove(i);
            }
        }

        return result;
    }

}
