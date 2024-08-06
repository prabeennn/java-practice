package com.string.practice;
import java.util.*;
public class OccuranceOfEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scn.next();
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\u0000';
				}
				
			}
			if(ch[i]!='\u0000')
				System.out.println(ch[i]+"="+count);
		}
	}

}
