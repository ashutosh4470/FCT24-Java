package main.treatment;

import main.person.Doctor;
import main.person.Patient;

public abstract class Treatment {

    protected Doctor doctor;
    protected Patient patient;

    public Treatment(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
    }

    public abstract void performTreatment();
}
