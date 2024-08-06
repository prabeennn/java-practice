package com.streamapi.practice;

import java.util.ArrayList;

import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<>();
		list.add(12);
		list.add(34);
		list.add(23);
		list.add(24);
		list.add(50);
		
		System.out.println(list.stream().filter(t->t%2==0).collect(Collectors.toList()));
	}

}
