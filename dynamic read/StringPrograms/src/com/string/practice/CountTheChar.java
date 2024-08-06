package com.string.practice;

public class CountTheChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "PraBEen@#1818vK";
		int uc=0;
		int lc=0;
		int nc=0;
		int sc=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
				uc++;
			else if(ch>='a' && ch<='z')
				lc++;
			else if(ch>='0' && ch<='9')
				nc++;
			else
				sc++;
		}
		System.out.println("Upper case count is= "+uc);
		System.out.println("Lower case count is= "+lc);
		System.out.println("number case count is= "+nc);
		System.out.println("Special case count is= "+sc);

	}

}
