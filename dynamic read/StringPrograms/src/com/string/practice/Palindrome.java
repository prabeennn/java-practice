package com.string.practice;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scn.next();
		if(isPalindrome(s))
			System.out.println(s+" is a palindrome String");
		else
			System.out.println(s+" is not a Palindrome String");
	}
	public static boolean isPalindrome(String s) {
		
		int i=0;
		int j=s.length()-1;;
		
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j))
			return false;
			i++;
			j--;
		}
		return true;
		
	}

}
