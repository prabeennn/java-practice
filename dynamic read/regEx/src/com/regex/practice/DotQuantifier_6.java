package com.regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DotQuantifier_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abccabddddaefff";
		String exp="[a-z]c{2}";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find()) {
		System.out.println(m.group());
	}
	}

}
