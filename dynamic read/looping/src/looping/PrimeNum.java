package looping;
import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=s.nextInt();
		int count=0;
		if(n<=1)
		{System.out.println(n+" not a prime number");
		return;
		}
		for(int i=2;i<n/2;i++)
		{
			if(n%i ==0)
			{
		count ++;
		break;
			}

	}
		if(count==0) System.out.println(n+" is primeNum");
		else System.out.println(n+" is not a primeNum");
	}

}
