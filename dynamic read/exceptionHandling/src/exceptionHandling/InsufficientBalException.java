package exceptionHandling;

public class InsufficientBalException extends Exception {
	public InsufficientBalException() {
		super("Bal is Low");
	}
	InsufficientBalException(String s){
		super(s);
	}

}
