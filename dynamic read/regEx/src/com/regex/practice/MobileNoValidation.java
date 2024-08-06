package com.regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNoValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="[6789][0-9]{9}";
		String s="9876543210";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		if(m.matches())
			System.out.println("valid Mobile Num");
		else
			System.out.println("Invalid Mobile Num");
	}

}
