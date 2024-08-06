package conditionalOperator;
import java.util.Scanner;

public class EvenOddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Num");
		int a = scn.nextInt();
		String res = (a%2==0)? "is EvenNum" : "is OddNum";
		System.out.println(res);

	}

}
