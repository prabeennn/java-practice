package com.numberprog.practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=scn.nextInt();
		//int fact=1;
		int count=0;
		for(int i=1;i<=n/2;i++) {
			//fact*=i;
			if(n%i==0)
			count++;
		}
		System.out.println(count);
		

	}

}
