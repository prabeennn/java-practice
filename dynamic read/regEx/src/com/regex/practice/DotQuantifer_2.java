package com.regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DotQuantifer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a\\.b\\.c\\.d\\.e";
		String exp="\\\\";;
		
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
