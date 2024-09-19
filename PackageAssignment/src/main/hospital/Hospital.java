package main.hospital;

import java.util.ArrayList;
import java.util.List;

import main.person.Doctor;
import main.person.HealthyPerson;
import main.person.Patient;

public class Hospital {
	private String hospitalName;
	private String location;
	private List<Doctor> doctors; // hasA
	private List<Patient> patients; // hasA
	private List<HealthyPerson> healthyPeople; // hasA
	private final static int maxPatients = 100;

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

	public void addPatient(final Patient patient) { // usesA
		if(patients.size() < maxPatients )
			patients.add(patient);
		else
			System.out.println("Max Capacity reached ...");
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