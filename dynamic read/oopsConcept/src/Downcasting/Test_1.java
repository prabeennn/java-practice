package Downcasting;

class Car {
	void m() {
		System.out.println("Main");
	}

}
class Audi extends Car{
	void m1() {
		System.out.println("Main m1");
	}
	
}
class Q3 extends Audi{
	void m2() {
		System.out.println("main m2");
	}
	
}
class Test_1{
	public static void main(String[] args) {
		Car c=new Q3();
		c.m();
		Audi a=(Audi)c;
		a.m();
		a.m1();
		Q3 q=(Q3)c;
		q.m();
		q.m1();
		q.m2();
	}
}
