package method;

public class A {

	public static void main(int a) {
		// TODO Auto-generated method stub
		m1();
		int i=m1();
		System.out.println("i="+i);
		
		int j=m1()*3;
		System.out.println("j="+j);
		System.out.println(m1());

	}
	static int m1() {
		System.out.println("m1 starts");
		System.out.println("m1 ends");
		return 20;
	}
	
}
