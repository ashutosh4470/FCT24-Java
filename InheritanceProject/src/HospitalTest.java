import java.util.ArrayList;
import java.util.List;

public class HospitalTest {
	public static void main(String[] args) {
		Patient patient1 = new Patient("xyz", 79);
		Patient patient2 = new Patient("pqr", 80);

		Doctor doctor1 = new Doctor("Ram", "Surgeon");
		Doctor doctor2 = new Doctor("Shyam", "Heart Surgeon");

		Hospital hospital = new Hospital("Wockhardt", "Mumbai");

		hospital.addDoctor(doctor1);
		hospital.addDoctor(doctor2);

		hospital.addPatient(patient1);
		hospital.addPatient(patient2);

		HealthyPerson healthyPerson1 = hospital.produceHealthyPerson(doctor1, patient1);
		HealthyPerson healthyPerson2 = hospital.produceHealthyPerson(doctor2, patient2);
		hospital.displayHospitalInfo();
		System.out.println(healthyPerson1);
		System.out.println(healthyPerson2);

	}
}

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Doctor extends Person{
	private String specialization;

	public Doctor(String name,String specialization) {
		super(name);
		this.specialization = specialization;
	}

	public String getSpecialization() {
		return specialization;
	}

	public String toString() {
		return "Doctor [name=" + name + ", specialization=" + specialization + "]";
	}
}

class Patient {
	private String name;
	private int age;

	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return "Patient [name=" + name + ", age=" + age + "]";
	}
}

class Hospital {
	private String hospitalName;
	private String location;
	private List<Doctor> doctors; // hasA
	private List<Patient> patients; // hasA
	private List<HealthyPerson> healthyPeople; // hasA

	public Hospital(String hospitalName, String location) {
		this.hospitalName = hospitalName;
		this.location = location;
		this.doctors = new ArrayList<>();
		this.patients = new ArrayList<>();
		this.healthyPeople = new ArrayList<>();
	}

	public void addDoctor(Doctor doctor) { // usesA
		doctors.add(doctor);
	}

	public void addPatient(Patient patient) { // usesA
		patients.add(patient);
	}

	public HealthyPerson produceHealthyPerson(Doctor doctor, Patient patient) {    //ProduceA 
		HealthyPerson healthyPerson = new HealthyPerson(patient);
		healthyPeople.add(healthyPerson);
		return healthyPerson;
	}

	public void displayHospitalInfo() {
		System.out.println("Hospital Name: " + hospitalName);
		System.out.println("Hospital Location: " + location);

		System.out.println("Doctors:");
		for (Doctor doctor : doctors) {
			System.out.println(doctor);
		}

		System.out.println("Patients:");
		for (Patient patient : patients) {
			System.out.println(patient);
		}
	}
}

class HealthyPerson {
	private String name;
	private int age;
	private String status;

	public HealthyPerson(Patient patient) {
		this.name = patient.getName();
		this.age = patient.getAge();
		this.status = "Healthy"; // Mark the person as healthy
	}

	@Override
	public String toString() {
		return "HealthyPerson [name=" + name + ", age=" + age + ", status=" + status + "]";
	}
}
