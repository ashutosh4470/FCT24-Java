package main.person;

public class Patient extends Person{
    private int age;

    public Patient(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Patient [name=" + name + ", age=" + age + "]";
    }
}
