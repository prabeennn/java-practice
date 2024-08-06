package looping;
import java.util.Scanner;
public class evennoinRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		for(int i = a; i<=b; i++)
		{
			if(i%2==0)
				System.out.println(i);
				
		}

	}

}
