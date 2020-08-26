package TheDailyByte_12_week;
import java.util.*;

public class Lunchtime {

	public static void main(String[] args) {
		System.out.println(solve("FDFDFD"));
		System.out.println(solve("FDFFDFDD"));
	}

	private static int solve(String s) {
		
		if(s.length() < 2)
			return 0;
		
		Deque<Character> queue = new ArrayDeque<>();
		int count = 0;
		
		for(int i = 0 ; i < s.length() ; i++) {
			char c = s.charAt(i);
			if(c == 'F')
				queue.add(c);
			if(c == 'D') {
			    queue.poll();
				if(queue.isEmpty())
					count++;
			}
		}
		
		return count;
	}

}
