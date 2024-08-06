package com.sorting.practice;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {3,23,34,1,4,0};
		int temp;
		for(int i=0;i<a.length-1;i++) {
			int flag=0;
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]+" ");
			}
		}

	}


