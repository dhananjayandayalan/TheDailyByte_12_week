package TheDailyByte;

public class Edit_Distance {
    public static void main(String[] args) {
        System.out.println(solve("cat", "bat"));
        System.out.println(solve("beach", "batch"));
    }
    public static int solve(String s, String t){
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != t.charAt(i))
                count++;
        }
        return count;
    }
}
