package com.wrapperclass.practice;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(new Integer(10),20);
		//m1(10,20);   CTE
		m1(30,new Integer(240));
	}
		
		public static void m1(int a,Integer b) {
			System.out.println("Primitive a="+a+"Non-Primitive b="+b);
			
		}
		public static void m1(Integer a, int b) {
			System.out.println("Non-Primitive a="+a+"Primitive b="+b);
		}
	}


