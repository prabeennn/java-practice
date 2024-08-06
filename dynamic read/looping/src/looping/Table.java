package looping;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the table");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		for(int i=1;i<=b;i++)
			System.out.println(a+"*"+i+"="+(a*i));

	}

}
