package com.wrapperclass.practice;

public class Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m1(109));     //non-primitive(integer) value 109
		System.out.println(m1(new Integer(20)));    // primitive (int) value 20
	}
	public static Integer m1(int a) {
		return a;
	}
	public static int m1(Integer a) {
		return a;
	}

}
