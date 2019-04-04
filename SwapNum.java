
public class SwapNum {
	
	public static void main(String[] args) {
		
		// swap two numbers using third variable
		
		int x=9 ; int y=6;
		
		int temp;
		
		temp = x;
		x=y;
		y= temp;
		
		
		System.out.println("After Swaping the numbers ::"+ x +" "+y);
		
		// swap two numbers without using third variable
		
		int a =4; int b=2;
		 a= a+b;
		 b= a-b;
		 a=a-b;
		 
		 System.out.println("After Swaping the numbers ::"+ a +" "+b);
	}
	
	
	 

}
