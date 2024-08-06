package com.staticClass.practice;

import com.staticClass.practice.A.B;

class A{
	 static class B{
		public void m1() {
			System.out.println("King Kohli");
		}
	}
	
}

public class Demo_1 {

	public static void main(String[] args) {
		B a=new A.B();
		a.m1();

	}

}
