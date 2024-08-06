package com.encapsulation.practice;
class A{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int x) {
		value=x;
	}
	
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.setValue(100);
		System.out.println(a.getValue());

	}

}
