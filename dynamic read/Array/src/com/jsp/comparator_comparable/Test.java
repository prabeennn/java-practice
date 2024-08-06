package com.jsp.comparator_comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Comparator<String> com=new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				if(o1.length()>o2.length()) {
					return 1;
				}else return -1;
			}
		};
		List<String> str=new ArrayList<>();
		str.add("A");
		str.add("BB");
		str.add("CCC");
		str.add("DDDD");
		
		Collections.sort(str,com);
		System.out.println(str);
	}

}
