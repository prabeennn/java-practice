package com.string.practice;

public class Split_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd@efghi@jklmnp";
		String [] s1=s.split("@");
		
		for(int i=s1.length-1;i>=0;i--) {
			System.out.print(s1[i]+" ");
		}

	}

}
