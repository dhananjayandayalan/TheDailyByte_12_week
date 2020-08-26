package TheDailyByte_12_week;
import java.util.*;

public class River_Crossing {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{0, 1, 10}));
        System.out.println(solve(new int[]{0, 1, 2, 4}));
    }

    private static boolean solve(int[] stones) {
        int n=stones.length;

        if(n<=1) return true;
        LinkedList<Integer>[] al=new LinkedList[n];

        for(int i=0;i<n;i++){
            al[i]=new LinkedList<Integer>();
        }

        al[0].add(0);

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                LinkedList<Integer> l=al[j];
                int jump=stones[i]-stones[j];
                if(l.contains(jump)||l.contains(jump+1)||l.contains(jump-1)) al[i].add(jump);
            }
        }
        return al[n-1].size()!=0;
    }
}
