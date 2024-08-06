package method;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method is started");
		Demo.m1();
		System.out.println("main method is ended");
	}
	public static void m1() {
		System.out.println("m1 is started");
		Demo.m2();
		System.out.println("m1 is ended");
	}
	public static void m2() {
		System.out.println("m2 is called");
		

	}

}
