package inderitance;
class Animal{
	 void eat() {
		 System.out.println("Eating.......");
	}
	
}
class Dog extends Animal{
	void bark() {
		System.out.println("Bow Bowwwwwwwwwwww.....");
	}
}
class BabyDog extends Dog{
	void weep() {
		System.out.println("weeping.............");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("Meow meowwwwwwwwwwww....");
	}
}
public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.eat();
		
		Dog d=new Dog();
		d.eat();
		d.bark();
		BabyDog b=new BabyDog();
		b.weep();
		b.bark();
		b.eat();
		Cat c=new Cat();
		c.eat();
		c.sound();
		
		

	}

}
