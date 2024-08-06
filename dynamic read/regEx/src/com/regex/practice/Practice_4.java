package com.regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "([a-z])([1-9])\\2";
		String s = "a1a22cc2c11";
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		while (m.find())
			System.out.println(m.group());

	}

}
