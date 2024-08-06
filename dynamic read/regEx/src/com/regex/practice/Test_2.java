package com.regex.practice;
import java.util.regex.*;
public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bananadan";
		String exp="an";
		
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("---------------");
		}
	}

}
