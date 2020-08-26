package TheDailyByte;

public class Stairmaster {
    public static void main(String[] args) {

        System.out.println(solve(new int[]{5, 10, 20}));
        System.out.println(solve(new int[]{1, 5, 10, 3, 7, 2}));

    }

    private static int solve(int[] stairs) {
        int f1 = 0, f2 = 0;
        for(int i = stairs.length - 1 ; i >= 0 ; i--){
            int f0 = stairs[i] + Math.min(f1, f2);
            f2 = f1;
            f1 = f0;
        }
        return Math.min(f1, f2);
    }
}
