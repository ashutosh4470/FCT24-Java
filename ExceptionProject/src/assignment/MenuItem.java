package assignment;

import assignment.checkedexceptions.OutOfStockException;
import assignment.uncheckedexceptions.InvalidQuantityException;

public class MenuItem {
	private String name;
	private double price;
	private int stock;
	
	public MenuItem(String name, double price, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void orderItem(int quantity) throws OutOfStockException {
		if(quantity <= 0)
			throw new InvalidQuantityException("Quantity must be greater than zero");
		if(stock < quantity )
			throw new OutOfStockException("Items out of stock Sorry...   \nCurrent stock : "+stock);
		stock -= quantity;
		System.out.println("Order placed successfully for "+quantity+" "+name+"...");
	}
	
}
