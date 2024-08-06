package exceptionHandling;

public class Try_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Starts");
		try {
			System.out.println("Try-1");
			//System.out.println(10%0); //here it will show as exception Handled Down also
			//System.out.println(10/0);
			System.out.println(10.0/0);
			System.out.println(10/0.0);
			System.out.println(10.0%0);
			System.out.println(10%0.0);
			System.out.println("Try-2");
		}
		catch(ArithmeticException e) {
			System.out.println("exception Handled");
		}
		System.out.println("Main Ends");
	}

}
