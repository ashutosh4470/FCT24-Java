package assignment.uncheckedexceptions;

public class MinimumOrderNotMetException extends RuntimeException{
	public MinimumOrderNotMetException(String msg) {
		super(msg);
	}
}
