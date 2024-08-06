package upcasting;
class A{
	void m1() {
		System.out.println("wqjwed");
	}
	
}
class B extends A{
	void m2() {
		
	}
}
public class Upcast_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		A a=(A)b;
		a.m1();
		
		B b1= new B();
		A a1=b1;
		a1.m1();
		
		A a2=new B();
		a2.m1();
	}

}
