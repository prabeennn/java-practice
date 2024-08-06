package inderitance;
class Animal_1{
	String colour="Black";
}
class Dog_1 extends Animal_1{
	String colour="White";
	public void behavior() {
		System.out.println(super.colour);
		System.out.println(colour);
	}
}
public class Super_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog_1 d=new Dog_1();
		d.behavior();

	}

}
