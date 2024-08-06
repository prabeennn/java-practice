package exceptionHandling;

public class Finally_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Starts");
		System.out.println("DB Open");
		String s=null ;
		
		try {
			System.out.println(s.length());
			return;
			
		}
		catch(ArithmeticException | IndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Exception Handled");
		}
		finally {
			System.out.println("DB closed");
		}
		System.out.println("Main ends");
	}

}
