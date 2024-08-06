package com.regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DotQuantyifer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abccdeabcedabcdcefedabcdefefda";
		String exp="[abcdef].[abcde].[abcd].";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
