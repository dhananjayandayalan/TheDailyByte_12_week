package TheDailyByte;
import java.util.*;

public class Palindrome_Splitting {

    public static void main(String[] args) {
        System.out.println(palindrome_splitting("abcba"));
    }

    private static List<List<String>> palindrome_splitting(String s) {
        List<List<String>> result = new ArrayList<>();
        bt(result, new ArrayList<String>(), s);
        return result;
    }
    public static void bt(List<List<String>> res, List<String> temp, String s){
        if(s.length()==0){
            res.add(new ArrayList(temp));
            return;
        }

        for(int i=0;i<s.length();i++){
            if(isPalindrome(s.substring(0,i+1))){
                temp.add(s.substring(0,i+1));
                bt(res,temp,s.substring(i+1));
                temp.remove(temp.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }


}
