package exceptionHandling;

public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="20u";
		System.out.println("main starts");
		try {
			int n=Integer.parseInt(s);
			System.out.println(n);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Exception Handled");
		}
		System.out.println("Main Ends");
	}

}
