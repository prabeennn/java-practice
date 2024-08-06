package com.lambdaExpression.practice;
@FunctionalInterface
interface C{
	boolean show();
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c= ()->
		{
			System.out.println("New show");
			return true;
		};
		c.show();

	}

}
