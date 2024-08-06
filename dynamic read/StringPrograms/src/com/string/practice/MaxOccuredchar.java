package com.string.practice;
import java.util.*;
public class MaxOccuredchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		int maxCount=0;
		char maxChar=' ';
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
			if(ch[i]!='\u0000' && count > maxCount)
			{
				maxCount=count;
				maxChar=ch[i];
			}
	}
		System.out.println(maxChar+"="+maxCount);

}
}
