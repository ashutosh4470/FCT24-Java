public class DivideTest2 {
	public static void main(String[] args) {
		
		 
		System.out.println("Begin main");
		
		int x = 10;
		System.out.println("x "+x);
		
		int y = 0;
		System.out.println("y "+y);
		
		System.out.println("Trying to divide "+x+" by "+y);
		try {
			int z = x / y;
			System.out.println("z "+z);
		}
		catch(ArithmeticException e) {
			System.err.println("Problem : "+e);
		}
		System.out.println("End main");
		
	}
}