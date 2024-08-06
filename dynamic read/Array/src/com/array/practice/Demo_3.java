package com.array.practice;

public class Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,3};
		m1(a);
		for(int n:a) {
			System.out.println(n);
		}
		
	}
	static void m1(int[]a) {
		for(int i=0;i<a.length;i++) {
			a[i]++;
			
		}
		System.out.println("ai executed");
	}

}
