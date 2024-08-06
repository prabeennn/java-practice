package com.string.practice;
import java.util.*;
public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String");
		Scanner scn=new Scanner(System.in);
		String s= scn.next();
		char[] ch=s.toCharArray();
		
		for (int i=0;i<ch.length-1;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp=' ';
					temp=ch[j];
					ch[j]=ch[i];
					ch[i]=temp;
				}
			}
		}
		System.out.println(ch);
	}

}
