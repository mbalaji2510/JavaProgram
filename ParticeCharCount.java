import java.util.HashSet;


public class ParticeCharCount {
	public static void main(String[] args) {
		String input ="aaaabfffca";
		
		HashSet<Character> wordSet = new HashSet<Character>();
		//TreeSet<Character> wordSet = new TreeSet<Character>();
		
		int count=1;
		
		wordSet.add(input.charAt(0));
		
		StringBuilder output = new StringBuilder("");
		
		for(int i=1; i<input.length(); i++) {
			
			char next = input.charAt(i);
			
			// if set contain same character then increment the count value
			
			if(wordSet.contains(next)) {
				
				count++;
			}
			
			else {
				char prev = input.charAt(i-1);
				if(count == 1) {
					output.append(Character.toString(prev)+"|");	
				}
				else {
					output.append(Character.toString(prev)+"*" +count+"|");
				}
				
				wordSet.remove(prev);
				wordSet.add(next);
				count=1;
				
				
			}
		}
		
		if(count == 1) {
			output.append(Character.toString(input.charAt(input.length()-1)));	
		}
		else {
			output.append(Character.toString(input.charAt(input.length()-1))+"*" +count);
		}
		
		System.out.println(output);
		
	}
	
	

}
