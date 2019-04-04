import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentMdfyEx {
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<String>(Arrays.asList("test","test4","test5","test"));
		
		// using the Iterator
		//Iterator<String> itr = myList.iterator();
		
		/*while(itr.hasNext()) {
			System.out.println("using iterator");
			String val = itr.next();
			
			if (val.equals("test")) {
				myList.remove(val);
			}
				
		}
		*/
		// using the foreach
		
		for (String str : myList) {
			System.out.println("using foreach");
			myList.remove(str);
			
			
		}
		
		}
		
	}
	
	
	


