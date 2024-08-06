package com.arraylist.practice;
import java.util.*;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		
		// Add element
		list.add(0);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		//get element
		int element=list.get(2);
		System.out.println(element);
		
		//add element in between
		list.add(2,4);
		System.out.println(list);
		
		//set element
		list.set(1, 1);
		System.out.println(list);
		
		//delete element
		list.remove(1);
		System.out.println(list);
		
		//size
		int size=list.size();
		System.out.println(size);
		
		//loops
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
	}

}
