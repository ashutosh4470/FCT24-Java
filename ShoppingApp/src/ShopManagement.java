

public class ShopManagement {
	public static void main(String[] args) {
		Product product1 = new Product("P001","Laptop", 145000.0, 20);
		Product product2 = new Product("P002","Smartphone", 25000.0, 1);
		
		Cart cart = new Cart();
		cart.addProduct(product1, 20);
		cart.addProduct(product2, 2);
		cart.displayCart();
		
		Order order = new Order("ORD001", cart);
		order.displayOrder();
		
	}
}

