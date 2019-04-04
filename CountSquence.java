import java.util.Arrays;
import java.util.Scanner;

public class CountSquence {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        int count = 0;
        String sortStr = sc.nextLine();
        //String sortStr = sortString(st);
        System.out.println("After Sorting give input value::"+sortStr);
        
        char ch = sortStr.charAt(0);
        	
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < sortStr.length(); i++)
        {

        if (ch == sortStr.charAt(i))
        {
        	
        count++;
        }
        else
        {
        System.out.println("Testing code::"+count);
       sb= sb.append(ch + "*" + count+"|");
        count = 1;
        ch = sortStr.charAt(i);
        }

        }
        System.out.println("Testing code22::"+count);
        sb.append(ch + "*" + count+"");
        
        System.out.println(sb);
        
          
        
       
        sc.close();

}

	private static String sortString(String st) {
		char tempArray[] = st.toCharArray(); 
		Arrays.sort(tempArray);
		return new String(tempArray); 
	}
}
