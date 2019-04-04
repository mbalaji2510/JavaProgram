
public class Sample {
	
	int a=9;
	int b=8;
	public Sample() {
		
		init();
		
	}
	private void init() {
		int c = a + b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		Sample s = new Sample();
		System.out.println("=====Test====");
	}

}
