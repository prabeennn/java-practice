package com.string.practice;

public class Substring_bigPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		String bigPalindrome="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+3;j<=s.length();j++) {
				String s1=s.substring(i,j);
				if(isPalindrome(s1)) {
					if(s1.length()>=bigPalindrome.length()) {
						bigPalindrome=s1;
					}
				}
			}
		}
		System.out.println(bigPalindrome);
	}
	public static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;

}
}
