package inderitance;
class B extends C{
	public void m1() {
		//m2();
		System.out.println("Hello");
	}
}
class C {
	public void m2() {
		
		System.out.println("Inheritance");
	}
	
}

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1=new C();
		c1.m2();
		//c1.m2();
		B b1=new B();
		b1.m1();
		b1.m2();

	}

}
