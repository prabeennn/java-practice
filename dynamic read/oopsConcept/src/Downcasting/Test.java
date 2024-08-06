package Downcasting;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Dog();
		//a.jump();    compile time err
		// Dog d=a1;	compile time erer
		
		Dog d=(Dog)a;	//downcasting
		d.jump();
		
		Animal a1=new Cat();
		Cat c=(Cat)a1;
		c.killRat();
		
		Animal a2=new Animal();
		a2.all();

	}

}
