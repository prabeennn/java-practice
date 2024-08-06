package com.array.practice;

public class SmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {4,3,5,7,8,5,9,2,1,2,1,0,10};
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min)min=a[i];
		}
		System.out.print(min);

	}

}
