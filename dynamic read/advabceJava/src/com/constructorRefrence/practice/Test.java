package com.constructorRefrence.practice;
@FunctionalInterface
interface A{
	Driver m1();
}
class Driver{
	public void m2() {
		System.out.println("Hello World");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=Driver::new;
		Driver d=a.m1();
		d.m2();
		
		

	}

}
