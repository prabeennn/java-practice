package com.regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*(^@#$<>!)).{6,8}";
		String s="Jsp@1234";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		if(m.matches())
			System.out.println("valid Password");
		else
			System.out.println("Invalid Password");
	}

}
