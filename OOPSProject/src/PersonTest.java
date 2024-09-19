
public class PersonTest {
	public static void main(String[] args) {

		Person person1 = new Person('M', "Ashutosh", 24);
		Person person2 = new Person('F', "LadyDon", 22);
		Person person3 = new Person('M', "Mahendra", 25);
		Person person4 = new Person('F', "Aasawari", 23);
		Person person5 = new Person('M', "Yogesh", 20);
		
//		person1.think();
//		person1.walking(500);
//		float caloriesBurnt = person1.workout(90);
//		System.out.println("\tCalories burnt : " + caloriesBurnt);
//
//		int pagesRead = person1.bookReading();
//		System.out.println("\tPerson read " + pagesRead + " PAGES...");
//
//		person3.walking(500);
//		person4.eating("Apple");
//		person2.walking(150);
//		person3.walking(250);
//		person2.bookReading();
//		person4.walking(350);
//		person3.workout(45);
//		person5.walking(650);
		
		person1.sleep();
		person2.sleep(6);
		person3.sleep(5, false);
		person4.sleep(7, "Home");
		person5.sleep(8, "Home", true);
		
	}
}

class Person {
	private char gender;
	private String name;
	private int age;

	Person() {
		System.out.println("Person constructor invoked...");
	}

	Person(char gender, String name, int age) {
		this.gender = gender;
		this.name = name;
		this.age = age;
	}

	// 1. function WITHOUT argument | WITHOUT return type
	// returnType without arugment
	void think() {
		System.out.println(name + " is thinking....");
	}

	// use your imagination to make a similar function of category 1
	// MAKE IT HERE
	void sleep() {
		System.out.println(name + " is sleeping....");
	}

	void sleep(int hrs) {
		System.out.println(name + " is sleeping...." + hrs + " hrs");
	}

	void sleep(int hrs, String location) {
		System.out.println(name + " is sleeping for " + hrs + " hrs at " + location + ".");
	}

	void sleep(int hrs, boolean isDeepSleep) {
		if (isDeepSleep) {
			System.out.println(name + " is in deep sleep for " + hrs + " hrs.");
		} else {
			System.out.println(name + " is sleeping lightly for " + hrs + " hrs.");
		}
	}

	void sleep(int hrs, String location, boolean isDeepSleep) {
		String sleepType = isDeepSleep ? "deep sleep" : "light sleep";
		System.out.println(name + " is in " + sleepType + " for " + hrs + " hrs at " + location + ".");
	}

	// 2. function WITH argument | BUT WITHOUT return type
	void walking(int steps) {
		System.out.println(name + " is walking " + steps + " STEPS...");
	}

	// use your imagination to make a similar function of category 2
	// MAKE IT HERE
	void eating(String food) {
		System.out.println(name + " eating " + food);
	}

	// 3. function WITH arguments | AND WITH return type [ int here ]
	float workout(int minutes) {
		System.out.println(name + " doing workout for " + minutes + " MINUTES");
		return minutes * 3.5f; // x calories burnt out
	}

	// use your imagination to make a similar function of category 3
	// MAKE IT HERE
	double distanceCovered(double speed, int time) {
		System.out.println(name + " is traveling at " + speed + " km/h for " + time + " hours.");
		return speed * time;
	}

	// 4. function WITHOUT argument | BUT WITH return type
	int bookReading() {
		System.out.println(name + " read the book .....");
		return 30; // number of pages read | or time took in mnts to read
	}

	// use your imagination to make a similar function of category 4
	// MAKE IT HERE
	boolean isAdult() {
		System.out.println(name + " age 18.");
		return true;
	}
}