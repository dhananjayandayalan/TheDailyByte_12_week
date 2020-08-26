package TheDailyByte;

public class Flight_Prices {

    public static void main(String[] args) {

        int[][] prices = {{40,30},{300,200},{50,50},{30,60}};
        System.out.println(solve(prices));

    }

    private static int solve(int[][] prices) {
        int sum = 0;

        for(int i = 0 ; i < prices.length ; i++){
            sum += Math.min(prices[i][0], prices[i][1]);
        }

        return sum;
    }

}
