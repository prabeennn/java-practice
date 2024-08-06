package com.prog.practice;

public class CommonCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abcde";
		String str2="aedif";
		String str3="adeif";
		
		String common="";
		
		for(char z: str.toCharArray()) {
			if(str.indexOf(z)!=-1 && str2.indexOf(z)!=-1 && str3.indexOf(z)!=-1) {
				common+=z;
			}
			
		}
		System.out.println("Common Character: "+common);

	}

}
