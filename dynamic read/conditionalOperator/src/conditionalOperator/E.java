package conditionalOperator;
import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int res = (a>b ? (a>c ? a:c):(b>c ? b:c));
		System.out.println(res);
		

	}

}
