package assignment;

import java.util.ArrayList;
import java.util.List;

import assignment.uncheckedexceptions.MaxOrdersReachedException;
import assignment.uncheckedexceptions.UnauthorizedAccessException;

public class User {
	private String username;
	private String password;
	private List<Order> orders;
    private static final int MAX_ORDERS_PER_DAY = 5;
    
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		this.orders = new ArrayList<>();
	} 
    
	public void login(String username ,String password) {
		if(!this.username.equals(username) || !this.password.equals(password))
			throw new UnauthorizedAccessException("Invalid username or password");
		System.out.println("User logged in successfully");
	}
    public void placeOrder(Order order) {
    	if(orders.size() >= MAX_ORDERS_PER_DAY)
    		throw new MaxOrdersReachedException("Maximum orders reached for the day. Limit: " + MAX_ORDERS_PER_DAY);
    	orders.add(order);
        System.out.println("Order placed successfully.");
    }
    
    public String getUserName() {
    	return username;
    }
    public List<Order> getOrders(){
    	return orders;
    }
	
}
