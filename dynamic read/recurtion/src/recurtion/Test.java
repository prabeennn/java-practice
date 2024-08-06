package recurtion;
import java.util.Scanner;
public class Test {
	public static void main(String[]args) {
		System.out.println("Enter a Number to find its factorial:");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int result = fact(num);
        System.out.println("Factorial of " + num + " is: " + result);		
	}
	static int fact(int n) {
		if(n==0||n==1) return 1;
		return n* fact(n-1);
	}

}
