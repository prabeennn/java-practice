package com.sorting.practice;

public class InsertionSort {
	public static void sort(int []a) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>-1 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

	public static void main(String[] args) {
		
		int []a= {1,5,4,23,54,2,9};
		sort(a);
		for(int n :a) {
			System.out.println(n);
		}
		
	}

}
