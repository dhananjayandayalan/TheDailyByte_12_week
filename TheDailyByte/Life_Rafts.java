package TheDailyByte;
import java.util.*;

public class Life_Rafts {

    public static void main(String[] args) {

        System.out.println(life_rafts(new int[]{1, 3, 5, 2}, 5));
        System.out.println(life_rafts(new int[]{1, 2}, 3));
        System.out.println(life_rafts(new int[]{4, 2, 3, 3}, 5));

    }

    private static int life_rafts(int[] weights, int limits) {

        Arrays.sort(weights);
        int i = 0, j = weights.length - 1;
        int result = 0;
        while(i <= j){
            result++;
            if(weights[i] + weights[j] <= limits)
                i++;
            j--;
        }
        return result;
    }

}
