package com.lambdaExpression.practice;
@FunctionalInterface
interface B{
	void m1();
}

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=()->{
			System.out.println("Hello");
			//return i;
		};
		b.m1();
	}

}
