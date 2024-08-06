package exceptionHandling;

public class Finally_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Exception Handled");
		}

	}
	public static void m1() {
		m2();
		
	}
	public static void m2() {
		System.out.println(10%0);
	}

}
