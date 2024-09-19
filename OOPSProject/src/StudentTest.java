
public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.rollNo = 1;
		student.name = "Ashutosh Mahale";
		student.subject1 = "Science";
		student.subject2 = "Math";
		student.subjectOneTest(80);
		student.subjectTwoTest(70);
		student.displayStudentInfo();
		student.subjectTwoTest(50);
		student.displayStudentInfo();
		
		/*
		* Naming conventions
		*  ClassName	- DriverManager, PoolManager, SytemManager
		*  fields		- rollNumber, socialSecurityNumber, adhaarCardNumber
		*  methodName - setLookAndFeel(), getConnection()
		*  CONSTANT 	- PI, SPEED_OF_LIGHT, MAX, MIN
		*  packages 	- java.lang, java.net, jungle.wild, jungle.domestic
		*/
		 
	}
}

class Student {
	int rollNo;
	String name;
	String subject1;
	String subject2;
	int subjectOneMarks;
	int subjectTwoMarks;
	int totalMarks;

	public void subjectOneTest(int marks) {
		this.subjectOneMarks = marks;
	}

	public void subjectTwoTest(int marks) {
		this.subjectTwoMarks = marks;
	}

	public void displayStudentInfo() {
		totalMarks = subjectOneMarks + subjectTwoMarks;
		System.out.println("\n--------Student Information---------");
		System.out.println("Student Roll No :" + rollNo);
		System.out.println("Student Name :" + name);
		System.out.println(subject1 + " Marks : " + subjectOneMarks);
		System.out.println(subject2 + " Marks : " + subjectTwoMarks);
		System.out.println("Total Marks : " + totalMarks);
	}
}