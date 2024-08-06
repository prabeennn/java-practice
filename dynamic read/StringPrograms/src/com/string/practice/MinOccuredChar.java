package com.string.practice;
import java.util.*;
public class MinOccuredChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);;
		System.out.println("Enter a String");
		String s=scn.next();
		int minCount=s.length();
		char minChar=' ';
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\u0000';
				}
			}
				if(ch[i]!='\u0000')
					System.out.println(ch[i]+"="+count);
				if (ch[i]!='\u0000'  && count<minCount){
					minCount=count;
					minChar=ch[i];
					
					
				}
			}
			System.out.println("---------------");
			System.out.println(minChar+"="+minCount);
		}
	}


