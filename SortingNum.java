
public class SortingNum {
	
	public static void main(String[] args) {
		
		int sort[] = {12,3,45,4};
		int temp;
		/*for(int num : temp) {
			System.out.println(num);
		}*/
		
		for (int num =0; num<sort.length;num++) {
			
			
			for(int j=num+1; j<sort.length; j++) {
				
				if(sort[num] > sort[j]) {
					
					temp = sort[num];
					sort[num] = sort[j];
					sort[j] = temp;
					
					
				}
				
			}
		}
		
		System.out.println("Sorting the numbers "+sort.length);
		for(int result : sort) {
			System.out.println("Sorting the numbers in order "+result);
		}
		
		
	}

}
