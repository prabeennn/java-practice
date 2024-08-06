package com.string.practice;

public class Split_reverse_prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is easy";
		String [] s1=s.split(" ");
		String str="";
		
		for(int i=0;i<s1.length;i++) {
			str+=rev(s1[i])+" ";
		}
		System.out.println(str);
	}
	public static String rev(String s) {
		String str="";
		for(int i=s.length()-1;i>=0;i--) {
			str +=s.charAt(i);
		}
		return str;
	}

}
