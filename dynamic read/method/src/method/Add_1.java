package method;
import java.util.Scanner;

public class Add_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = scn.nextInt();
		double d = scn.nextDouble();
		Add_1 t = new Add_1();
		t.m1(a, d);
	}
	public static void m1(int a, double d) {
		System.out.println(a+d);
		

	}

}
