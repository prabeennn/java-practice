package method;
import java.util.Scanner;
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=m1();
		System.out.println("a="+a);

	}
	static int m1()
	{
		//System.out.println("m1 starts");
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a number");
		int b= scn.nextInt();
		return ++b;
	}

}
