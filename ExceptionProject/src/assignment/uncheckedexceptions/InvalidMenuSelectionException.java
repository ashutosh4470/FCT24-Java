package assignment.uncheckedexceptions;

public class InvalidMenuSelectionException extends RuntimeException{
	public InvalidMenuSelectionException(String msg) {
		super(msg);
	}
}
