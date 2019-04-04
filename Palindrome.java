import java.util.Scanner;

public class Palindrome {

public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder(A);
        sb.reverse();
        if(A.equalsIgnoreCase(sb.toString())) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
    }
}
