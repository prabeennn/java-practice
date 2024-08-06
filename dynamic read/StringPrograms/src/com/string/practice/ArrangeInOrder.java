package com.string.practice;

public class ArrangeInOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PrabeEn@#18Vk";
		String uc= "";
		String lc= "";
		String nc= "";
		String sc= "";
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z')
				uc+=ch;
			else if(ch>='a' && ch<='z')
				lc+=ch;
			else if(ch>='0' && ch<='9')
				nc+=ch;
			else
				sc+=ch;
		}
		s=uc+lc+nc+sc;
		System.out.println(s);
	}

}
