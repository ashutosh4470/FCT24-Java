package main;

import main.hospital.Hospital;
import main.person.Doctor;
import main.person.HealthyPerson;
import main.person.Patient;
import main.treatment.HeartSurgery;
import main.treatment.Surgery;
import main.treatment.Treatment;

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
		hospital.displayHospitalInfo();

		
		Treatment surgery1 = new Surgery(doctor1, patient1);
		surgery1.performTreatment();
		Treatment heartSurgery = new HeartSurgery(doctor2, patient2);
		heartSurgery.performTreatment();

		HealthyPerson healthyPerson1 = hospital.produceHealthyPerson(doctor1, patient1);
		HealthyPerson healthyPerson2 = hospital.produceHealthyPerson(doctor2, patient2);
		System.out.println(healthyPerson1);
		System.out.println(healthyPerson2);
        System.out.println("Total Healthy Persons: " + HealthyPerson.getHealthyPersonCount());


	}
}
