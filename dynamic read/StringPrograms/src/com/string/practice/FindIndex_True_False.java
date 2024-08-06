package com.string.practice;

public class FindIndex_True_False {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="whiskey is love";
		System.out.println(indexOf(s,'w'));

}
	
public static boolean indexOf(String s,char key) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==key)
				return true;
		}
		return false;
	}

}


