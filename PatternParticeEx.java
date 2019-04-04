
public class PatternParticeEx {
	
	public static void main(String[] args) {
		
		// normal order
		for (int i=0; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(j);
			}
			
			//System.out.println();
		}
		
		
		// reverse pattern
		
		for(int k=5; k>=1; k--) {
			
			for(int l=1; l<=k; l++) {
				
				System.out.print(l);
			}
			
			System.out.println();
			
		}
	}

}
