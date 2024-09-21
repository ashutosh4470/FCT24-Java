package assignment;

import assignment.checkedexceptions.CouponExpiredException;
import assignment.checkedexceptions.DeliveryUnavailableException;
import assignment.checkedexceptions.InvalidPaymentMethodException;
import assignment.checkedexceptions.OrderProcessingException;
import assignment.uncheckedexceptions.MinimumOrderNotMetException;

public class Order {
	private int items;
	private double totalAmount;
	private String deliveryAddress;
	private String paymentMethod;
	private String couponCode;
	
	private static final double MIN_ORDER_AMOUNT = 20.0;
	/*
	public Order(int items, double totalAmount, String deliveryAddress, String paymentMethod, String couponCode) {
		super();
		this.items = items;
		this.totalAmount = totalAmount;
		this.deliveryAddress = deliveryAddress;
		this.paymentMethod = paymentMethod;
		this.couponCode = couponCode;
	}
	*/
	public void placeOrder() throws CouponExpiredException, OrderProcessingException {
		if(totalAmount < MIN_ORDER_AMOUNT)
			throw new MinimumOrderNotMetException("Minimum order amount should be greater than $"+MIN_ORDER_AMOUNT);
		if(couponCode != null && isCouponExpired(couponCode))
			throw new CouponExpiredException("Coupon Code "+couponCode+" has expired");
		if(!processOrder())
			throw new OrderProcessingException("Error occurred while processing the order");
		System.out.println("Order placed successfully  ....\nThank You!");
	}
	
	public void validatePaymentMethod(String paymentMethod) throws InvalidPaymentMethodException {
		String[] methods = {"CreditCard","PayPal","DebitCard"};
		boolean isValid = false;
		for(String method : methods) {
			if(method.equalsIgnoreCase(paymentMethod)) {
				isValid = true;
				break;
			}
		}
		if(!isValid)
			throw new InvalidPaymentMethodException("Invalid payment method : "+paymentMethod);
		this.paymentMethod = paymentMethod;
		System.out.println("Payment method validate");
	}

	public void deliverOrder(String address) throws DeliveryUnavailableException {
		if(address == null || address.isEmpty()) {
			throw new DeliveryUnavailableException("Delivery address is invalid or unavailable");
		}
		if(!attemptDelivery(address)) {
			throw new DeliveryUnavailableException("Delivery could not be completed to the provided address");
		}
        System.out.println("Order delivered successfully to: " + address);
	}
	
	private boolean isCouponExpired(String couponCode) {
		return false;
	}
	private boolean processOrder() {
		return true;
	}
	private boolean attemptDelivery(String address) {
		return true;
	}
	
	
	public int getItems() {
		return items;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setItems(int items) {
		this.items = items;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
}
