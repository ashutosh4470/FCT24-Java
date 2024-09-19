
package jungle.tree;

public class Monkey {
	
	int           defaultA=100;
	private int   privateB=200;
	protected int protectedC=300;
	public int    publicD=400;

	
	public void jump() {
		Parrot p = new Parrot();
		p.fly();
		Sparrow s = new Sparrow();
		s.chirp();
		System.out.println("Monkey is jumping...");
	}
}
//is a Child
class Chimp extends Monkey //isA - same package 
{
	void hoop() {
		System.out.println("default   : "+defaultA);//same package
		System.out.println("private   : "+privateB);
		System.out.println("protected : "+protectedC); //same package -even if Crocodile is non-child of Frog
		System.out.println("public    : "+publicD);
		
		
	}
}
//is a non-child of Monkey
class ButterFly { //But in same tree package
	void fly() {
		Monkey monkey = new Monkey();
		monkey.jump();
		System.out.println("default   : "+monkey.defaultA);//same package
		System.out.println("private   : "+monkey.privateB);
		System.out.println("protected : "+monkey.protectedC); //same package -even if Crocodile is non-child of Frog
		System.out.println("public    : "+monkey.publicD);
		
	}
}
