package com.string.practice;
import java.util.*;
public class SumofNumInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=scn.next();
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>'0'&&ch<'9') {
				sum+=ch-'0';
			}
//			if(ch>48 && ch<57) {    we can do it by taking ASCII values also
//				sum+=ch-48;
//			}
		}
		System.out.println(sum);
	}

}
