package com.abstract1.practice;

abstract class A{
	void m1() {
		System.out.println("m1 in A");
	}
	abstract void m2();
}
class B extends A{
	void m2() {
		System.out.println("m2 in B");
	}
}
class C extends B{
	void m2() {
		System.out.println("m2 in C");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		a.m1();
		a.m2();
		a=new C();
		a.m1();
		a.m2();
//		B b=new B();
//		b.m2();
//		b.m1();
	}

}
