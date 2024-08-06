package com.regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="a?b*";
		String s="baabcbbabbb";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
			System.out.println(m.group());
		
	}

}
