package looping;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int a =scn.nextInt();
		int b = scn.nextInt();
		System.out.println("Enter numbers");
		for(int i=3;i<=10;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
