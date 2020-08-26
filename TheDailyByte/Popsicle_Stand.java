package TheDailyByte;

public class Popsicle_Stand {

	public static void main(String[] args) {
		System.out.println(solve(new int[] {5, 10}));
		System.out.println(solve(new int[] {10}));
		System.out.println(solve(new int[] {5, 5, 5, 10, 20}));
	}

	private static boolean solve(int[] customers) {
		
		int five = 0, ten = 0, twenty = 0;
		
		for(int i : customers) {
			if(i == 5) {
				five++;
			}
			else if(i == 10) {
				if(five == 0)
					return false;
				five--;
				ten++;
			}
			else{
				if(five > 0 && ten > 0) {
					five--;
					ten--;
					twenty++;
			    }
				else if(five > 3) {
					five -= 3;
					twenty++;
				}
				else 
					return false;
			}
		}	
		return true;
	}
}