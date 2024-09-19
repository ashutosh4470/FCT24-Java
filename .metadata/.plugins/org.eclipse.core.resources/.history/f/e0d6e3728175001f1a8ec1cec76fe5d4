package main.person;

public class HealthyPerson {
	private String name;
	private int age;
	private String status;
	private static int healthyPersonCount;

	public HealthyPerson(Patient patient) {
		this.name = patient.getName();
		this.age = patient.getAge();
		this.status = "Healthy"; // Mark the person as healthy
		healthyPersonCount++;
	}

	public static int getHealthyPersonCount() {
		return healthyPersonCount;
	}

	@Override
	public String toString() {
		return "HealthyPerson [name=" + name + ", age=" + age + ", status=" + status + "]";
	}
}
