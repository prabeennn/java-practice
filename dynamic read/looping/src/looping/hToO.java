package looping;
import java.util.Scanner;
public class hToO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the range");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		for(int i=a;i>=b;i--)
			System.out.println(i);
		

	}

}
