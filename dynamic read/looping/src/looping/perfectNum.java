package looping;
import java.util.Scanner;
public class perfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = scn.nextInt();
		int sum = 0;
		for(int a=1; a<i; a++)
		{
			if(i%a==0)
				sum+=a;
		}
		if(sum==i)
			System.out.println(i+" Is perfectNum");
		else
			System.out.println(i+" is not a perfectNum");

	}

}
