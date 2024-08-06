package com.string.practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		System.out.println(rev(s));

	}
	public static String rev(String s) {
		String temp = "";
		for(int i=s.length()-1;i>=0;i--) {
			temp += s.charAt(i);
		}
		return temp;
	}

}
