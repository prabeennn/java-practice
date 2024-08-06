package com.abstract1.practice;
abstract class D{
	abstract void ab();
	
	void m1() {
		System.out.println("hoho");
	}
}
class E extends D{
	void ab() {
		System.out.println("hehe E");
	}
}
public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d=new E();
		d.m1();
		d.ab();
	}

}
