package TheDailyByte_12_week;

public class Longest_Common_Subsequences {
    public static void main(String[] args) {
        System.out.println(solve("xyz", "xyz"));
        System.out.println(solve("abca", "acea"));
        System.out.println(solve("abc", "def"));
    }
    private static int solve(String s, String t){
        int l1 = s.length();
        int l2 = t.length();
        int[][] cache = new int[l1 + 1][l2 + 1];

        for(int i = 1 ; i <= l1 ; i++){
            for(int j = 1 ; j <= l2 ; j++){
                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    cache[i][j] = 1 + cache[i - 1][j - 1];
                }
                else{
                    cache[i][j] = Math.max(cache[i - 1][j], cache[i][j - 1]);
                }
            }
        }
        return cache[l1][l2];
    }
}
