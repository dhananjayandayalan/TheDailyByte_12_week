package TheDailyByte;
import java.util.*;

public class Who_Wins {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3}));
    }

    private static boolean solve(int[] points){

        int player1 = 0;
        int player2 = 0;

        for(int i = 0 ; i < points.length ; i++){
            if(i % 2 == 1)
                player2 += points[i];
            else
                player1 += points[i];
        }
        return player1 > player2;
    }
}
