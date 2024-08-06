package method;
import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two number");
		int a = scn.nextInt();
		double b = scn.nextDouble();
		Add t = new Add();
		t.m1(a, b);
	}
	public static void m1(int a,double b) {
		System.out.println(a+b);
		

	}

}
