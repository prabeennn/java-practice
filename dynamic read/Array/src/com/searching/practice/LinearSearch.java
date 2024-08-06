package com.searching.practice;

public class LinearSearch {

	public static int search(int []a,int e) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==e) return 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {2,4,52,4,324,65,6};
		System.out.println(search(a,4));
		System.out.println(search(a,34));
		}
	}


