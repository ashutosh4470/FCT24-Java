package main.treatment;

import main.person.Doctor;
import main.person.Patient;

public class Surgery extends Treatment{
	public Surgery(Doctor doctor, Patient patient) {
        super(doctor, patient);
    }

    @Override
    public void performTreatment() {
        System.out.println("Performing surgery on patient: " + patient.getName() + " by doctor: " + doctor.getName());
    }
}
