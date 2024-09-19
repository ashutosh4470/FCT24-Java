//
//public class SingleLevelTest {
//	public static void main(String[] args) {
//		
//		Person person = new Person('M',22,"Prakash");
//		System.out.println("Person : "+person); // + symbol will invoke toString()
//		System.out.println("----------------------");
//		
//		Student student = new Student('F',22,"Jacky","X","A",123,440); // 540 out of 600
//		System.out.println("student : "+student);
//		
//		
//	}
//}
//
//
//class Person // "Object" class is the parent of all the classes in Java
//{
//	private char gender; //cyan color is for the fields here
//	private int age;
//	private String name;
//	
//
//	
//	public Person(char gender, int age, String name) {
//		//super(); //it would invoke the constructor of the Object class
//		//super(); is the default first line of every constructor
//		this.gender = gender; //blue color here for the local argument
//		this.age = age;
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return "Person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
//	}
//}
//
//class Student extends Person
//{
//	private String standard;
//	private String division;
//	private int rollNumber;
//	private float totalMarks;
//	private float average;
//	private String grade; // + 3 variables from the super class = 9 variables
//	
//	public Student(char gender, int age, String name, String standard, String division, int rollNumber,
//			float totalMarks) {
//		super(gender, age, name); //REUSE OF THE SUPER CLASS CODE - refer super class ctor..
//		this.standard = standard;
//		this.division = division;
//		this.rollNumber = rollNumber;
//		this.totalMarks = totalMarks;
//		this.average = totalMarks/6;
//		
//			 if(this.average >= 90) this.grade="A";
//		else if(this.average >= 75 && this.average<90) this.grade="B";
//		else if(this.average >= 60 && this.average<75) this.grade="C";
//		else if(this.average >= 45 && this.average<60) this.grade="D";
//		else if(this.average >= 35 && this.average<45) this.grade="E";
//		else if(this.average >= 1 && this.average<35)  this.grade="F";
//					 
//	
//	}
//
//	@Override
//	public String toString() {			//REUSE THE CODE - super. would refer the super class data/function
//		return "Student [toString()=" + super.toString() + ", standard=" + standard + ", division=" + division
//				+ ", rollNumber=" + rollNumber + ", totalMarks=" + totalMarks + ", average=" + average + ", grade="
//				+ grade + "]";
//	}
//
//	
//	
//	
//}
//
//
//
//
////Rule in inheritance
////1. The default ctor of child (B) invokes the default ctor of its parent(A)
//class A
//{
//	//we have a default ctor here
//}
//class B extends A
//{
//	//we have a default ctor here - super();
//}
///*---------------------------------------------*/
////2. The default ctor of child (Y) invokes the no-arg ctor of its parent(X)
//class X
//{
//	X() { }
//}
//class Y extends X
//{
//	// super in the default
//}
///*---------------------------------------------*/
////3. The no-arg ctor of child (Q) invokes the default ctor of its parent(P)
//class P
//{
//	
//}
//class Q extends P
//{
//	Q() { super(); }
//}
///*---------------------------------------------*/
////4. The parameterized ctor of child(S) invokes the default ctor of its parent (R)
//class R
//{
//
//}
//class S extends R
//{
//	S(int i) { //<--- this parameterized would invoke the default ctor of R
//		//super();
//	}
//}
////5. The parameterized ctor of child(M) invokes the no-arg ctor of its parent (R)
//class L
//{
//	L() { }
//}
//class M extends L
//{
//	M(int i) { //<--- this parameterized would invoke the default ctor of L
//		//super();
//	}
//}
////6. The default ctor of the child (O) is finding it difficult to trace no-arg Or default ctor in PARENT(N)
//// SOLUTION 1: make a new no-arg ctor in the parent
//// SOLUTION 2: write a constructor in the child to invoke the "super" class constructor explicitly
//class N {
//	N(int i) { //<-- call this man from the child (O) at line 98
//		
//	}
//	
//	
//}
//class O extends N {
//	
//	O() {
//		super(32);//will invoke line number 90
//	}
//	
//}