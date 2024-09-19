package interfaces;

public class AnimalTest {
	public static void main(String[] args) {
		
    Bird bird = new Bird("Sparrow", "Bird", "Forest", 20.0);
    bird.eat();
    bird.makeSound();
    bird.move();
    bird.displayInfo();
    
    Fish fish = new Fish("Goldfish", "Fish", "Freshwater","Freshwater", 5.0);
    fish.eat();
    fish.makeSound();
    fish.move();
    fish.displayInfo();
	}
}

interface Eatable{
	void eat();
}

abstract class Animal{
	protected String name;
	protected String type;
	protected String habitate;
	
	public Animal(String name, String type, String habitate) {
		super();
		this.name = name;
		this.type = type;
		this.habitate = habitate;
	}
	
	public abstract void makeSound();
	public abstract void move();
	public void displayInfo() {
		System.out.println("Name : "+name+", Type : "+type+", Habitate : "+habitate);
	}
}
class Bird extends Animal implements Eatable{
	private double flyingSpeed;

	public Bird(String name, String type, String habitate,double flyingSpeed) {
		super(name, type, habitate);
		this.flyingSpeed = flyingSpeed;
	}

	@Override
	public void eat() {
        System.out.println(name + " chirps!");		
	}

	@Override
	public void makeSound() {
        System.out.println(name + " is an herbivore.");		
	}

	@Override
	public void move() {
        System.out.println(name + " flies with a speed of " + flyingSpeed + " km/h.");	
	}
}

class Fish extends Animal implements Eatable{

	private String waterType;
	private double swimSpeed;
	public Fish(String name, String type, String habitate,String waterType,double swimSpeed) {
		super(name, type, habitate);
		this.waterType = waterType;
		this.swimSpeed = swimSpeed;
	}

	@Override
	public void eat() {
        System.out.println(name + " is a carnivore.");
	}

	@Override
	public void makeSound() {
        System.out.println(name + " doesn't make much noise, but bubbles!");		
	}

	@Override
	public void move() {
        System.out.println(name + " swims with a speed of " + swimSpeed + " km/h in " + waterType + " water.");
	}
	
}



