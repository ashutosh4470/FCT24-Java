import java.util.HashMap;
import java.util.Map;

public class Cart{
	private Map<Product,Integer> items = new HashMap<>();
	
	public void addProduct(Product product,int quantity) {
		if(items.containsKey(product))
			items.put(product,items.get(product)+quantity);
		else
			items.put(product, quantity);
		product.setQuantity(product.getQuantity() - quantity);
	}
	
	public void removeProduct(Product product) {
		items.remove(product);
	}
	public double getTotalPrice() {
		double total = 0;
		for(Map.Entry<Product, Integer> entry : items.entrySet()) {
			total += entry.getKey().getPrice() * entry.getValue();
		}
		return total;
	}
	public Map<Product,Integer> getItems(){
		return this.items;
	}
	public void displayCart() {
		System.out.println("-----------Cart Items----------");
		for(Map.Entry<Product,Integer> entry : items.entrySet()) {
			Product product = entry.getKey();
			int quantity = entry.getValue();
			System.out.println("Product : "+product.getName()+" , Quantity : "+quantity+", Price : "+product.getPrice());
		}
		System.out.println("Total Price : "+getTotalPrice());
	}
	
}