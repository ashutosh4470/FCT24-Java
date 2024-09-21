package assignment.checkedexceptions;

public class CouponExpiredException extends Exception {
	public CouponExpiredException(String msg) {
		super(msg);
	}
}
