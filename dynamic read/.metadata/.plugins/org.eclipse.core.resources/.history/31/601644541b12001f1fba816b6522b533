package com.methodRefrence.practice;

@FunctionalInterface
interface A{
	String apply(String s);
}

class StringOperations{
	static String lowercase(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') {
				ch=(char)(ch+32);
				
			}
			res=res+ch;
		}
		
		return res;
	}
}
public class Static_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringOperations so=new StringOperations();
		A a= StringOperations::lowercase;
		//String result=a.apply("ABC");
		System.out.println(a.apply("ABFDF"));

	}

}
