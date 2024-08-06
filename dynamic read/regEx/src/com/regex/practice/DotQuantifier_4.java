package com.regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DotQuantifier_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aeftue9654gbxgsn784nw85h8";
		String exp="[a-b].[^0-9]";
		
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		}
		
	}

}
