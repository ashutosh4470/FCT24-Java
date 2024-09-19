import java.util.HashMap;
import java.util.Map;

public class Order {
	private String orderId;
	private Map<Product,Integer> items = new HashMap<>();
	private double totalAmount;

	public Order(String orderId, Cart cart) {
		this.orderId = orderId;
		this.items = cart.getItems();
		this.totalAmount = cart.getTotalPrice();
	}

	public void displayOrder() {
		System.out.println("-------------Order Details-----------");
		System.out.println("Order Id : " + orderId);
		for (Map.Entry<Product, Integer> entry : items.entrySet()) {
			Product product = entry.getKey();
			int quantity = entry.getValue();
			System.out.println(
					"Product : " + product.getName() + " , Quantity : " + quantity + ", Price : " + product.getPrice());
		}
		System.out.println("Total Price : " + totalAmount);
	}
}
