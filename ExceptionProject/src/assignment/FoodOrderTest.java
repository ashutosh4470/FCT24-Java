package assignment;

import java.util.Scanner;

import assignment.checkedexceptions.CouponExpiredException;
import assignment.checkedexceptions.DeliveryUnavailableException;
import assignment.checkedexceptions.InvalidPaymentMethodException;
import assignment.checkedexceptions.OrderProcessingException;
import assignment.checkedexceptions.OutOfStockException;
import assignment.uncheckedexceptions.UnauthorizedAccessException;

public class FoodOrderTest {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		User user = new User("Ram","Ram@123");
		MenuItem pizza = new MenuItem("Pizza",149.50, 10);
		Order order = new Order();
		
		try {
			
			user.login("Ram","Ram@123");
			order.validatePaymentMethod("PayPal");
			pizza.orderItem(11);
			order.setTotalAmount(50.4);
			order.placeOrder();
			user.placeOrder(order);
			order.deliverOrder("Magarpatta");
			
		}catch(UnauthorizedAccessException e) {
			System.err.println(e);
		} catch (InvalidPaymentMethodException e) {
			System.err.println(e);
		} catch (OutOfStockException e) {
			System.err.println(e);
		} catch (CouponExpiredException e) {
			System.err.println(e);
		} catch (OrderProcessingException e) {
			System.err.println(e);
		} catch (DeliveryUnavailableException e) {
			System.err.println(e);
		}finally {
			sc.close();
		}
	}

}
