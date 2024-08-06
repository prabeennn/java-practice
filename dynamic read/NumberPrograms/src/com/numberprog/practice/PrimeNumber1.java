package com.numberprog.practice;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scn.nextInt();
		int count=0;
		if(n<=1) {
			System.out.println(n+"is not a prime number");
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("prime no");
		}
		else System.out.println("not a prime");
	}

}
