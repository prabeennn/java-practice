package com.immutable.practice;

class Circle{
	private int radius;

	public Circle(int radius) {
		
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public Circle setRadius(int n) {
		return new Circle(n);
	}
	
	
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(10);
		System.out.println(c1.getRadius());
		System.out.println(c1);
		c1=c1.setRadius(30);
		System.out.println(c1.getRadius());
		System.out.println(c1);
	}

}
