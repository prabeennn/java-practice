package com.numberprog.practice;
import java.util.Scanner;
public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num");
		int n=scn.nextInt();
		int sum=0;
		
		//System.out.println("Enter a num");
		for(int i=1;i<n;i++){
			if(n%i==0) {
				sum+=i;
				
			}
			
		}
		if(sum==n)
			System.out.println(n+" is a perfect number");
		else
			System.out.println(n+" is not a peerfect num");

	}

}
