

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println("Result: " +findSecondLarget(input));
		scan.close();
	}

	private static int findSecondLarget(int input) {
		int result=0;
		if(input<100 || input > 9999999) {
			result=0;
		} else {
			SortedMap<Integer, Integer> intMap = new TreeMap<>();
			while(input > 0) {
				Integer key = input%10;
				if(intMap.containsKey(key)) {
					int value = intMap.get(key);
					intMap.put(key, value+1);
				} else {
					intMap.put(key, 1);
				}
				input = input/10;
			}
			intMap.remove(intMap.lastKey());
			int key = intMap.lastKey();
			String value = (intMap.get(intMap.firstKey())).toString();
			StringBuffer strBffr = new StringBuffer();
			strBffr = strBffr.append(key).append(value);
			result =new Integer(strBffr.toString());
		}
		
		
		return result;
	}

}
