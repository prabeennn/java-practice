package com.string.practice;
import java.util.Scanner;
public class RepalceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=scn.next();
		System.out.println("Enter the character to replace: ");
		char ch=scn.next().charAt(0);
		System.out.println("Enter the char to replace with: ");
		char key=scn.next().charAt(0);
		replace(s,ch,key);

	}
	public static void replace(String s,char ch,char key) {
		char[]ch1=s.toCharArray();
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]==ch) {
				ch1[i]=key;
				
			}
		}
		System.out.println(ch1);
		
	}

}
