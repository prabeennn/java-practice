package looping;
import java.util.Scanner;
public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n =s.nextInt();
		int count=0;
		if(n<=1) {
			System.out.println("It is not a prime number");
			return;
			
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
				
				break;
			}
		}
		if(count==0)
			System.out.println(n+" is a Prime Number");
		else
			System.out.println(n+" is not a prime number");

	}

}
