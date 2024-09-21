package assignment.uncheckedexceptions;

public class MaxOrdersReachedException extends RuntimeException {
	public MaxOrdersReachedException(String msg) {
		super(msg);
	}
}
