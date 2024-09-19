
public class Coffee {
	public static void main(String[] args) {
		BoilWater boilWater = new BoilWater();
		AddCoffee addCoffee = new AddCoffee();
		ServeCoffee serveCoffee = new ServeCoffee();
		
		boilWater.boil();
		addCoffee.add();
		serveCoffee.serve();
	}
}
class BoilWater{
	private String kettle = "Kettle";
	public void boil() {
		System.out.println("Step 1 :using "+kettle+" to Boiling water");
	}
}
class AddCoffee{
	private String coffeePowder= "coffeePowder";
	private String spoon="spoon";
	public void add() {
		System.out.println("Step 2 :using "+spoon+" Adding "+ coffeePowder);
	}
}
class ServeCoffee{
	private String cup = "cup";
	public void serve() {
		System.out.println("Step 3 : Serving coffee in "+cup);
	}
}