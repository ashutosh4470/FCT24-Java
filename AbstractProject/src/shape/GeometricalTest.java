package shape;

public class GeometricalTest {
	public static void main(String[] args) {
	
		//GeometricalShape shape = new GeometricalShape();
		
		GeometricalShape circle1 = new Circle(45);
		Circle c2 = (Circle) circle1;
		
		char c = 'a';
		int num = (int) c;
		
		System.out.println("num : "+num);
		c2.draw();
		c2.calcArea();
		c2.hii();
		
		System.out.println("----------");
		
		Square square = new Square(45);
		square.draw();
		square.calcArea();
		
		System.out.println("----------");
		
		Triangle triangle = new Triangle(10, 20);
		triangle.draw();
		triangle.calcArea();
		
		System.out.println("----------");
		
		Rectangle rectangle = new Rectangle(20, 40);
		rectangle.draw();
		rectangle.calcArea();
		
		System.out.println("----------");
		
		Kite kite = new Kite(20, 50);
		kite.draw();
		kite.calcArea();
	}
}

/* abstract class

			- may or may not have abstract methods
			
			- it is MEANT for inheritance
			
			- the immediate non-abstract class MUST implement the abstract
			  method of this class
			  
			- Abstract class cannot be instantiated
			
			- the main purpose of abstract class is to impose some
			business principles on the upcoming child class/es
			  
*/

abstract class GeometricalShape
{
	abstract void draw(); //abstract | incomplete | partial contract
	abstract void calcArea();
	
}
class Circle extends GeometricalShape
{
	float radius;
	private static final float PI=3.14f;
	
	Circle(float r) {
		radius = r;
	}
	
	void draw() { //mandatory development of this method
		System.out.println("Circle : draw() is mandatorily implemented");
	}
	void calcArea() {
		System.out.println("Circle : calcArea() : Calculating the area of the Circle....");
		float area = PI * radius * radius;
		System.out.println("Circle : area       : "+area);
	}
	
	void hii() {
		System.out.println("hii...");
	}
}

class Square extends GeometricalShape
{
	float side;
	
	Square(float r) {
		side = r;
	}
	
	void draw() { //mandatory development of this method
		System.out.println("Square : draw() is mandatorily implemented");
	}
	void calcArea() {
		System.out.println("Square : calcArea() : Calculating the area of the Square....");
		float area = side * side;
		System.out.println("Square : area       : "+area);
	}
}

class Triangle extends GeometricalShape{
	private int base;
	private int height;
	Triangle(int base,int height){
		this.base = base;
		this.height = height;
	}
	@Override
	void draw() {
		System.out.println("Triangle : draw() is mandatorily implemented");
	}

	@Override
	void calcArea() {
		System.out.println("Triangle : calcArea() : Calculating the area of the Traingle....");
		float area = (float) (0.5 * base * height);
		System.out.println("Triangle : area       : "+area);
	}	
}
class Rectangle extends GeometricalShape{
	private int length;
	private int width;
	
	Rectangle(int length,int width){
		this.length = length;
		this.width = width;
	}
	@Override
	void draw() {
		System.out.println("Rectangle : draw() is mandatorily implemented");
	}

	@Override
	void calcArea() {
		System.out.println("Triangle : calcArea() : Calculating the area of the Triangle....");
		float area = (float)length * width;
		System.out.println("Square : area       : "+area);
	}
	
}
class Kite extends GeometricalShape{
	private int diagonal1;
	private int diagonal2;
	Kite(int d1,int d2){
		diagonal1 = d1;
		diagonal2 = d2; 
	}
	@Override
	void draw() {
		System.out.println("Kite : draw() is mandatorily implemented");
	}
	@Override
	void calcArea() {
		System.out.println("Kite : calcArea() : Calculating the area of the Triangle....");
		float area = (float)(0.5)*(diagonal1 * diagonal2);
		System.out.println("Kite : area       : "+area);		
	}
	
}

class Ellipse extends Circle
{

	Ellipse(float r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	
	//No, it is NOT compulsory for the grand child [ non-abstract class ]
	//to develope the draw() method
}