
package jungle.river; //must be the first statement in java file

import jungle.tree.Monkey;

//default ctor of public class is also public
public class Frog {
	
	
	public Frog() {
		System.out.println("Frog ctor...");
	}
	public void jump() {
		System.out.println("Frog is jumping....");
	}
}
class Crocodile
{
	void swim() {
		Monkey monkey = new Monkey();
		monkey.jump();
		System.out.println("default   : "+monkey.defaultA);//same package
		System.out.println("private   : "+monkey.privateB);
		System.out.println("protected : "+monkey.protectedC); //same package -even if Crocodile is non-child of Frog
		System.out.println("public    : "+monkey.publicD);
		
	}
}
class Gorrila extends Monkey //isA - same package 
{
	void hoopHoop() {
		System.out.println("default   : "+defaultA);//same package
		System.out.println("private   : "+privateB);
		System.out.println("protected : "+protectedC); //same package -even if Crocodile is non-child of Frog
		System.out.println("public    : "+publicD);
		
		
	}
}
