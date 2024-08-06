package com.anonymousInnerClass.practice;

class Demo_2{
	public void show() {
		System.out.println("In demo show");
	}
}

public class AnonymousInnerClass {
		public static void main(String[] args) {
			Demo_2 d = new Demo_2()
			{
				public void show() {
					System.out.println("In new Show");
				}
			};
			d.show();
				
			
		}
	}



