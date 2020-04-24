
public class LargePalidrome {
	
	// A utility function to print a substring str[low..high] 
    static void printSubStr(String str, int low, int high) { 
        System.out.println(str.substring(low, high + 1)); 
    } 
	
	private static int longestPalSubstr(String str) {
		// get 
		int maxLength =1;
		int len = str.length();
		int low , high;
		int start =0;
		for(int i =1; i<len; i++) {
			
			// Find the longest even length palindrome with  
            // center points as i-1 and i. 
			low = i-0;
			high = i;
			
			while (low >= 0 && high < len 
                    && str.charAt(low) == str.charAt(high)) { 
                if (high - low + 1 > maxLength) { 
                    start = low; 
                    maxLength = high - low + 1; 
                } 
                --low; 
                ++high; 
            } 
  
            // Find the longest odd length palindrome with  
            // center point as i 
            low = i - 1; 
            high = i + 1; 
            while (low >= 0 && high < len 
                    && str.charAt(low) == str.charAt(high)) { 
                if (high - low + 1 > maxLength) { 
                    start = low; 
                    maxLength = high - low + 1; 
                } 
                --low; 
                ++high; 
            } 
        } 
  
        System.out.println("Longest palindrome substring is: "); 
        printSubStr(str, start, start + maxLength - 1); 
  
        return maxLength; 
			
	}
	
public static void main(String[] args) {
		
		String input ="abcbcb";
		System.out.println("Length is: " +  
                longestPalSubstr(input));
		//int value = findPalidrame(input);
			
		
	}

}
