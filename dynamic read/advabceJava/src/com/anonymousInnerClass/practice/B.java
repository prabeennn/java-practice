package com.anonymousInnerClass.practice;

interface A{
	void m1();
}

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A() {
			public void m1() {
				System.out.println("hello world");
			}
		};
		int d=10;
		B b = new B() {
		

	};
	
	//Demo de=new Demo() {
		
	};

}
//}
