package com.searching.practice;

public class BinarySearch {
	public static int search(int[]a,int e) {
		int start=0, end=a.length-1;
		while(start <=end) {
			int mid=(start+end)/2;
			if(e==a[mid]) return mid;
			else if(e<a[mid])end=mid-1;
			else start=mid+1;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {12,15,17,20,22};
		System.out.println(search(a,22));
	}

}
