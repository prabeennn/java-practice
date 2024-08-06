package com.wrapperclass.practice;

public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer b=Integer.valueOf(a); //auto boxing manually/explicitly
		System.out.println(a);
		System.out.println(b);
		
		int c=20;
		Integer d=c;  //auto boxing implicitly
		System.out.println(c);
		System.out.println(d);
	}

}
