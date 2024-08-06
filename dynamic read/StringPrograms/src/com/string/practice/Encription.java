package com.string.practice;

public class Encription {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Isbrgxax";
		System.out.println(isEncrypt(s,3));
	}
	public static String isEncrypt(String s,int key) {
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char c=ch[i];
			if(c>='A' && c<='Z')
				ch[i]=(char)('A'+((c-'A'+key)%26));
			else if(c>'a' && c<='z')
				ch[i]=(char)('a'+((c-'a'+key)%26));
		}
		return new String(ch);
	}

}
