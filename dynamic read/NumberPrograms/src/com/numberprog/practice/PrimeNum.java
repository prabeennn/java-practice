package com.numberprog.practice;
import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num");
		int n=scn.nextInt();
		int fact=1;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				fact=fact*i;
			}
		}
		if(fact==n)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime num");

	}

}
