
public class EducationTest {
	public static void main(String[] args) {
		Course dbda = new Course("Computer Science","YCP Mumbai",0.6f,"DBDA",10.0f,"Mr.Vishhal Dawane", 15, "DBDA");
		dbda.getEducationDetails();
		System.out.println("\tIs formal Education : "+(dbda.isFormalEducation()?"Yes":"No"));
		dbda.getCourseDetails();
		System.out.println("\tIs Online Course : "+(dbda.isOnlineCourse()?"Yes":"No"));
		
		CertificationCourse cloudCourse = new CertificationCourse("Information Technology","SPPU",0.9f,"Cloud Computing",5.0f, "Mr.Prakash", 5, "Java","Google Cloud",true);
		cloudCourse.getEducationDetails();
		System.out.println("\tIs formal Education : "+(cloudCourse.isFormalEducation()?"Yes":"No"));
		cloudCourse.getCourseDetails();
		System.out.println("\tIs Online Course : "+(cloudCourse.isOnlineCourse()?"Yes":"No"));
		cloudCourse.getCertificationDetails();
	}
}

class Education{
	private String field;
	private String institute;
	private float durationInYear;
	
	public Education() {
		this.field = "Computer Science";
		this.institute ="CDAC Acts";
		this.durationInYear = 0.6f;
	}
	
	public Education(String field,String institute,float durationInYear){
		this.field = field;
		this.institute = institute;
		this.durationInYear = durationInYear;
	}	
	void getEducationDetails() {
		System.out.println("\nEducation Details---------- ");
		System.out.println("\tField : "+field);
		System.out.println("\tInstitute :"+institute);
		System.out.println("\tDuration :"+durationInYear+" yr");
	}
	boolean isFormalEducation() {
		return durationInYear > 0.5f;
	}
}
class Course extends Education{
	private String courseName;
	private float credits;
	private Instructor instructor;
	
	public Course() {
		super();
		courseName = "PG-DAC";
		credits = 10.0f;
		instructor = new Instructor("Mr.Nathan",15,"PG-DAC");
	}
	public Course(String field,String institute,float durationInYear,String courseName,float credits,String name, int yearOfExperiences, String expertise) {
		super(field,institute,durationInYear);
		this.courseName = courseName;
		this.credits = credits;
		this.instructor = new Instructor(name, yearOfExperiences, expertise);
	}
	public void getCourseDetails() {
		System.out.println("Course Details---------- ");
		System.out.println("\tCourse Name : "+courseName);
		System.out.println("\tCredits : "+credits);
		instructor.getInstructorDetails();
	}
	public boolean isOnlineCourse() {
		return courseName.equals("DBDA");
	}
}

class CertificationCourse extends Course{
	private String certificateAuthority;
	private boolean hasFinalExam;
	
	public CertificationCourse() {
		super();
		this.certificateAuthority = "Coursera";
		this.hasFinalExam = true;
	}
	public CertificationCourse(String field, String institute, float durationInYear, String courseName, float credits, String name, int yearOfExperiences, String expertise,String certificateAuthority, boolean hasFinalExam) {
	    super(field, institute, durationInYear, courseName, credits, name, yearOfExperiences, expertise);
	    this.certificateAuthority = certificateAuthority;
	    this.hasFinalExam = hasFinalExam;
	}
	public void getCertificationDetails() {
		System.out.println("Certification details--------------");
		System.out.println("\tCertification Authority : "+certificateAuthority);
		System.out.println("\t Has Final Exam : "+(hasFinalExam?"Yes":"No"));
	}
}



class Instructor{
	private String name;
	private int yearOfExperiences;
	private String expertise;
	
	public Instructor(String name, int yearOfExperiences, String expertise) {
		super();
		this.name = name;
		this.yearOfExperiences = yearOfExperiences;
		this.expertise = expertise;
	}
	
	public void getInstructorDetails() {
		System.out.println("Instructor details------------");
		System.out.println("\tInstructor Name : "+name);
		System.out.println("\tYear of Experience : "+yearOfExperiences);
		System.out.println("\tExpertise : "+expertise);
	}
	
}

	





