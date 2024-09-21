package assignment.checkedexceptions;

public class InvalidPaymentMethodException extends Exception {
	public InvalidPaymentMethodException(String msg) {
		super(msg);
	}
}
