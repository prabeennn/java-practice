package com.methodRefrence.practice;

@FunctionalInterface
interface C{
	int apply(int a, int b);
}

class Calc{
	int add(int x,int y) {
		return x+y;
	}
	int sub(int x,int y) {
		return x-y;
	}
	int mul(int x,int y) {
		return x*y;
	}
	int div(int x,int y) {
		return x/y;
	}
}
public class Nonstatic_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c;
		Calc ca=new Calc();
		c=ca::add;
		int r1=c.apply(4, 46);
		System.out.println(r1);
		
		c=ca::div;
		System.out.println(c.apply(50, 2));
		c=ca::mul;
		System.out.println(c.apply(2, 2));
		

	}

}
