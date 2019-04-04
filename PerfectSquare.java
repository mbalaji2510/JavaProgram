import java.util.Scanner;

public class PerfectSquare {
	
	public static void main(String[] args) {
		
		System.out.println("=====Enterinput value::");
		
		Scanner scanner = new Scanner(System.in);
		
		double intVal = scanner.nextDouble();
		
		System.out.println("=====input value convert into double===="+intVal);
		
		System.out.println(Math.sqrt(intVal));
		
		// checking the perfect sqr or not
		
		double perSqr = Math.sqrt(intVal);
		
		if (intVal == perSqr*perSqr) {
			System.out.println("given value is perfect squre");
		}
		
		else {
			System.out.println("given value is not perfect squre");
		}
		
		
	}

}
