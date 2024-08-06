package com.test;
import java.util.*;

class Test{
	
	public static int search(int[]a, int e) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==e) return i;
		}
		return -1;
	}
	
		public static void main(String[] args) {
			int []a= {1,2,45,3,66,3,65};
			int element=65;
			int position=search(a, element);
			//System.out.println(search(a, 66));
			if(position != -1)
				System.out.println("Element "+element+" is in the position "+position);
			else
				System.out.println("Element "+element+" is not found in array..");
			
			
			
		}
}