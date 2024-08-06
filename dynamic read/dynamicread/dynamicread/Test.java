package dynamicread;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your name and age");
		String name = scn.nextLine();
		int age = scn.nextInt();
		
		System.out.println("Hi "+name+" your age "+age);

	}

}
