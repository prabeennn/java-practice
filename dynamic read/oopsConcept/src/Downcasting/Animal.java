package Downcasting;

public class Animal {
	void all() {
		System.out.println("4legs");
	}
}
class Dog extends Animal{
	void jump() {
		System.out.println("Jump in Dog");
	}
}
class Cat extends  Animal{
	void killRat() {
		System.out.println("killRat  in cat");
	}
}
