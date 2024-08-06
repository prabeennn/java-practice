package looping;
import java.util.Scanner;
public class Perfectno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scn.nextInt();
		int sum = 0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		if(sum==n)System.out.println(n+" is PerfectNum");
		else System.out.println(n+" is not a perfectNum");

	}

}
