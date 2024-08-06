package com.regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="[a-z][a-z 0-9]+@[a-z]+mail[.]com";
		String s="prabeennayak92@gmail.com";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		if(m.matches())
			System.out.println("valid Mail Id");
		else
			System.out.println("Invalid Mail Id");
	}

}
