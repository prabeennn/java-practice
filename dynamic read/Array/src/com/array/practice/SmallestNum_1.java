package com.array.practice;

public class SmallestNum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {3,2,5,3,1,0};
		int min=a[0];
		for(int n:a) {
			if(n<min)min=n;
		}
		System.out.println(min);

	}

}
