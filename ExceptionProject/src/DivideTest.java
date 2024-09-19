public class DivideTest {
	public static void main(String[] args) {
		
		 
		System.out.println("Begin main");
		
		int x = 10;
		System.out.println("x "+x);
		
		int y = 0;
		System.out.println("y "+y);
		
		System.out.println("Trying to divide "+x+" by "+y);
		if(y != 0) {
			int z = x / y;
			System.out.println("z "+z);
		}
		else {
			System.err.println("Cannot divide by zero...");
		}
		System.out.println("End main");
		
	}
}