package com.array.practice;

public class GreatestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {71,3,4,2,7,45,4};
		int max=a[0];
		for(int n:a) {
			if(n>max)max=n;
		}
		System.out.println(max);
	}

}
