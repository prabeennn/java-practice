package Downcasting;
class Car_1{
	
}
class Audi_1 extends Car_1{
	
}
class Q3_1 extends Audi_1{
	
}
public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_1 c=new Q3_1();
		System.out.println("c instance of Q3");
		System.out.println("c instance of Audi");
		
		Audi_1 a=new Q3_1();
		System.out.println("ccc");
	}

}
