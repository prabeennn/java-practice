package com.wrapperclass.practice;

public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=10;
		int b=a;  //auto unboxing implicitly
		
		System.out.println(a);
		System.out.println(b);
		
		Integer c=new Integer(21);   //auto unboxing explicitly
		int d=c.intValue();
	}

}
