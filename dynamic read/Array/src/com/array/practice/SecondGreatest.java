package com.array.practice;

public class SecondGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {2,1,4,2,6,9,7};
		int s1=a[0];
		int s2=a[0];
		for(int i=1;i<a.length;i++) {
			if(s1==a[i]) continue;
			
			if(a[i]>s1) {
				s2=s1;
				s1=a[i];
			}else if(a[i]>s2||s1==s2) {
				s2=a[i];
			}
		}
		System.out.println(s2);

	}

}
