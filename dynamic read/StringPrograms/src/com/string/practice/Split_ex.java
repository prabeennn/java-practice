package com.string.practice;

public class Split_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is easy";
		String[]s1=s.split(" ");
		for(int i=s1.length-1;i>=0;i--) {
			System.out.print(s1[i]+" ");
		}
		//String s = "Happy happy Holi";
		//String[] s1 = s.split(" ");
		for (String substring : s1) {
		    System.out.print(substring+" ");
		}


	}

}
