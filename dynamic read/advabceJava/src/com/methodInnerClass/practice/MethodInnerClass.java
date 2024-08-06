package com.methodInnerClass.practice;

public class MethodInnerClass {
	public void m1() {
		class B{
			public void m2() {
				System.out.println("Hello World");
			}
		}
		B b = new B();
		b.m2();
	}
	public static void main(String[] args) {
		MethodInnerClass m=new MethodInnerClass();
		m.m1();
	}

}
