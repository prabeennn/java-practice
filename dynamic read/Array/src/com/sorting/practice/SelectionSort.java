package com.sorting.practice;

public class SelectionSort {
	
	public static void sort(int []a) {
		for(int i=0;i<a.length-1;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index]) index=j;
			}
			int temp=a[index];
			a[index]=a[i];
			a[i]=temp;
			
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {2,34,3,65,1,8,9};
		sort(a);
		for(int n:a) {
			System.out.println(n);
		}

	}

}
