import java.util.HashSet;

public class CharCount {
	
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    HashSet<Character> set = new HashSet<Character>();
	   // String input = "aabbcdeaab";
	    String input = "aabbcc";
	    set.add(input.charAt(0));
	    int count = 1;
	    StringBuilder output = new StringBuilder("");
	    for(int i=1;i<input.length();i++) {
	        char next = input.charAt(i);
	        if(set.contains(next)) {
	            count++;
	        }else {
	            char prev = input.charAt(i-1);
	            output.append(Character.toString(prev) + count );
	            set.remove(prev);
	            set.add(next);
	            count=1;
	        }
	    }
	    output.append(Character.toString(input.charAt(input.length()-1)) + count );
	    System.out.println(output.toString());
	}

}
