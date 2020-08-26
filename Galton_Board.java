package TheDailyByte_12_week;

public class Galton_Board {
    public static void main(String[] args) {

        System.out.println(solve(2, 2));
        System.out.println(solve(4, 3));

    }

    private static int solve(int M, int N) {
        int[][] dp = new int[M + 1][N + 1];
        for(int i = 1 ; i <= M ; i++){
            for(int j = 1 ; j <= N ; j++){
                if(i == 1 && j == 1)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[M][N];
    }
}
