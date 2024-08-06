package com.jsp.LinkedList;


public class Test1 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		System.out.println("Size = "+l.size());
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		System.out.println("Size = "+l.size());
		
		for(int i=0;i<l.size();i++) {
			int e=(Integer)l.get(i);
			System.out.println(e);
		}
		
	}

}
