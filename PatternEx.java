
public class PatternEx {
	
	public static void main(String[] args) {
		
		// normal pattern
		int num=5;
		for(int i=1 ; i<=num; i++) {
		
		for (int j=1; j<=i; j++) {	
			System.out.print(j);
			
		}
		System.out.println();
	}
		
		
		// reverse pattern
		
		System.out.println("Second part");
		
		int revPat = 5;
		
		for(int rev=revPat ; rev>=1; rev--) {
		
			for (int k=1; k<=rev; k++) {
				System.out.print(k);
				
			}
			
			System.out.println();
			
		}
	}
}
