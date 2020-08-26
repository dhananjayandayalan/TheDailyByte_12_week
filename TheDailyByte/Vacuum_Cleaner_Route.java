package TheDailyByte;

public class Vacuum_Cleaner_Route {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String routes = "LD";
		
		Boolean result = vacuumcleanerroutes(routes);
		
		System.out.println(result);

	}

	private static Boolean vacuumcleanerroutes(String routes) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		for(int i = 0 ; i < routes.length() ; i++) {
			
			if(routes.charAt(i) == 'L' || routes.charAt(i) == 'U')
				count += 1;
			
			if(routes.charAt(i) == 'R' || routes.charAt(i) == 'D')
				count -= 1;
		}
		
		return count == 0;
	}

}
