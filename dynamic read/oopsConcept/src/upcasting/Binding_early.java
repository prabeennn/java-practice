package upcasting;

import inderitance.Static_block;
import inderitance.Ststic_block2;

class X{
	 static void m1() {
		System.out.println("m1 in X");
		
	}
}
class Y extends X{
	 static void m1() {
		System.out.println("m1 in Y");
	}
}
public class Binding_early {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x=new X();		//As it is static method the output will be on refrence type class
		x.m1();
		
		x=new Y();
		x.m1();

	}

}
