package method;

public class Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main Started");
		m2(10);
		m1(10.5);
		System.out.println("main ended");
	}
	public static void m1(double d) {
		System.out.println("m1 started"+d);
		m2(5);
		System.out.println("m1 ended"+d);
	}
	public static void m2(int i) {
		System.out.println("m2 started"+i);
		m3(3, 6);
	}
	public static void m3(int i,int j) {
		System.out.println(i+" "+j);
	}
}
		
		

	


