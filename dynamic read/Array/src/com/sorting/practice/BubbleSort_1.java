package com.sorting.practice;

public class BubbleSort_1 {
	public static void sort(int[]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,24,54,2,-1};
		sort(a);
		for(int n:a) {
			System.out.println(n);
		}

	}

}
