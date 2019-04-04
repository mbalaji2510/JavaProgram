import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ExmpleJava8 {
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<String>();
		myList.add("Test1");
		myList.add("Test2");
		myList.add("Test34");
		
		// using Java 8 iterate the list
		myList.forEach(
				// lambda Expression
				(names)->System.out.println(names)
				
				);
		
		// map
		
		Map<String,Integer> dataMap = new HashMap<String, Integer>();
		
		dataMap.put("Apple", 50);
		dataMap.put("Banana", 20);
		dataMap.put("Orange", 40);
		dataMap.put("Grapes", 30);
		
		dataMap.forEach((k,v)->System.out.println("Fruit:"+k +"price" +v));
		
		
		// using the Stream and lambda Expression
		
		long count = myList.stream().filter(str -> str.length()<6).count();
		
		System.out.println(count);
		
		// StringJoiner using java8
		
		// print each character from string value
		
		String test = "adnadfsas";
		char[] data = test.toCharArray();
		for (Character c : data) {
			StringJoiner str =  new StringJoiner("-");
			str.add(c.toString());
			
			System.out.println(str);
			
		}		
		/*StringJoiner str =  new StringJoiner("-");
		str.add("test");
		str.add("yree");*/
		
		//System.out.println(str);
		
		
		
		
		
		
	}
	
	
	
	

}
