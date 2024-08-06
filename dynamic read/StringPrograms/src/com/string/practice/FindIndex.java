package com.string.practice;

public class FindIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="whiskey is love";
		System.out.println(indexOf(s,'i'));

	}
	
	public static int indexOf(String s,char key) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==key)
				return i;
		}
		return -1;
	}

}
