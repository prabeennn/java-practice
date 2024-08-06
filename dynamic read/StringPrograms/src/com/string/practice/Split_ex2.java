package com.string.practice;

import java.util.Arrays;

public class Split_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is easy";
		String[] s1=s.split(" ");
		String[] s2=s.split("");
		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s2));
	}

}
