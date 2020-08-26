package TheDailyByte;

import java.util.*;

public class Greater_Elements {

    public static void main(String[] args) {

    /*  int[] num1 = {2, 4};
        int[] num2 = {1, 2, 3, 4};  */

        int[] num1 = {4, 1, 2};
        int[] num2 = {1, 3, 4, 2};

        int[] result = greaterelements(num1, num2);

        for(int i : result)
            System.out.print(i + " ");

    }

    private static int[] greaterelements(int[] num1, int[] num2) {

        Map<Integer, Integer> map = new HashMap();
        Stack<Integer> stack = new Stack();
        for(Integer i : num2){
               while(!stack.isEmpty() && stack.peek() < i)
                   map.put(stack.pop(), i);

               stack.push(i);
        }

        for(int i = 0 ; i < num1.length ; i++)
            num1[i] = map.getOrDefault(num1[i], -1);

        return num1;
    }

}
