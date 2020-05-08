package com.java8.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ConvertAlphabetToNumber {

	public static void main(String[] args) {
		List<String> inputList = new ArrayList<String>();
		inputList.add("three two one");
		inputList.add("one two three test");
		inputList.add("one five five three two two");
		System.out.println("Result: "+getComputedList(inputList));
	}
	
	public static List<String> getComputedList(List<String> inputList){
		List<String> result = new ArrayList<String>();
		for (String inputString : inputList) {
			Map<String, Integer> intMap = new TreeMap<>();
			String[] split = inputString.split(" ");
			for(int i=0; i< split.length; i++) {
				String str = split[i];
				String no = findEqualentNumber(str);
				if(null == no) {
					result.add("INVALID");
					intMap = null;
					break;
				}else if(intMap.containsKey(no)) {
					Integer value = intMap.get(no);
					intMap.put(no, value+1);
				} else {
					intMap.put(no, 1);
				}
			}
			if(null != intMap && !intMap.isEmpty()) {
				StringBuffer sb = new StringBuffer();
				Set<String> keys = intMap.keySet();
				for (String string : keys) {
					sb.append(string +"-"+intMap.get(string)+",");
				}
				sb.deleteCharAt(sb.length()-1);
				result.add(sb.toString());
			}
		}
		
		return result;
	}

	private static String findEqualentNumber(String str) {
		String no=null;
		if(str.equalsIgnoreCase("zero")) {
			no = "0";
		} else if(str.equalsIgnoreCase("one")) {
			no = "1";
		} else if(str.equalsIgnoreCase("two")) {
			no = "2";
		} else if(str.equalsIgnoreCase("three")) {
			no = "3";
		} else if(str.equalsIgnoreCase("four")) {
			no = "4";
		} else if(str.equalsIgnoreCase("five")) {
			no = "5";
		} else if(str.equalsIgnoreCase("six")) {
			no = "6";
		} else if(str.equalsIgnoreCase("seven")) {
			no = "7";
		} else if(str.equalsIgnoreCase("eight")) {
			no = "8";
		} else if(str.equalsIgnoreCase("nine")) {
			no = "9";
		}
		return no;
	}

}
