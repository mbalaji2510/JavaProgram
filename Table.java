import java.util.Scanner;

public class Table {
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        String finalout ="";
        int result=0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=1; i<=10; i++) {
            
            System.out.println(N+" *" +i +"="+N*i);
           
           
        }
       System.out.println(finalout);
        
        scanner.close();
    }

}
