package exceptionHandling;

public class Try_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Starts");
		try {
			System.out.println(10/0);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Handled");
		}
		System.out.println("Main Ends");

	}

}
