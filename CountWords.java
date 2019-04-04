import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountWords {
	
	public static void main(String[] args) {
		
		List<String> testList = new ArrayList(Arrays.asList("Balaji","test","test","Balaji"));
		List<String> duplist = new ArrayList();
		
		HashMap<String, Integer> countMap = new HashMap();
		
		int count = 1;
				
		for (String str : testList) {
			
			System.out.println(str);
			if(countMap.containsKey(str)) {
				
				countMap.put(str, countMap.get(str)+count);
				
			}
			
			else {
				countMap.put(str, count);
			}
			
		}
		
		System.out.println(countMap);
		
		for(Entry<String, Integer> entry : countMap.entrySet() ) {
			
			System.out.println(entry.getKey() +" " +entry.getValue());
			
		}
		
		
		// identifying the dupplicate
		List<String> testList1 = new ArrayList(Arrays.asList("Balaji","test","test","Balaji"));
		
		Set<String> remDup = new HashSet<String>(testList1);
		for (String duplicates : remDup) {
			
			//System.out.println("removed duplicate from list::"+duplicates);
			
		}
		
		// Character Map Testing
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		charMap.put('a', 1);
		charMap.put('a', 0);
		charMap.put('b', 2);
		charMap.put('f', 3);
		/*for(Entry<Character,Integer> entry : charMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}*/
		
		for(Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			
			System.out.println("Key ===="+entry.getKey() +"Value==="+entry.getValue());
			
		}
		
		
		
		
	}

}
