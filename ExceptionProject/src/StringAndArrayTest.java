
public class StringAndArrayTest {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30 };
		try {
			for(int i = 0;i<=arr.length;i++)
			System.out.println(arr[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
		
		String str = "Four Colors Private Limited";
		try {
			System.out.println(str.toLowerCase());
			System.out.println(str.toUpperCase());
			System.out.println("str 11th letter : " + str.charAt(10));
			System.out.println("str substring : " + str.substring(5, 39));
			System.out.println("End Main");
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
	}
}
