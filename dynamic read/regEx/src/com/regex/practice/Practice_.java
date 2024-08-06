package com.regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="ab?";
		String s="abbbbababba";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
			System.out.println(m.group());
		
	}

}
