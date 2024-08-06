package com.numberprog.practice;
import java.util.Scanner;
public class FebonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the range");
		int n=scn.nextInt();
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=n;i++) {
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}

	}

}
