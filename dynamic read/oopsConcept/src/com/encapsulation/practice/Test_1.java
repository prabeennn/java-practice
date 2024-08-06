package com.encapsulation.practice;


class B{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.setName("Prabeen");
		System.out.println(b.getName());
		
		B b1=new B();
		b1.setName("Swaraj");
		System.out.println(b1.getName());
		
	}

}
