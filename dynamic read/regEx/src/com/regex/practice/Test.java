package com.regex.practice;
import java.util.regex.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abacdabefab";
		String exp="ab";
		
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		
		int count=0;
		while(m.find()) {
			count++;
		}
		System.out.println(exp+"="+count);

	}

}
