package Downcasting;
import java.util.Scanner;
public class Vegetable {

}
class Carrot extends Vegetable{
	void prepareHalwa() {
		System.out.println("Halwa is ready");
	}
}
class Potato extends Vegetable{
	void prepareFries() {
		System.out.println("Fries is ready");
	}
}


class VegShop{
	
	 	Vegetable sell () {
		Scanner scn=new Scanner(System.in);
		System.out.println("1. Carrot");
		System.out.println("2. Potatos");
		System.out.println("enter your vag option");
		int n = scn.nextInt();
		if(n==1) return new Carrot();
		if(n==2) return new Potato();
		System.out.println("invalid input");
		return null;
	}
}