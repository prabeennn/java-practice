package looping;
import java.util.Scanner;
public class FactofEachDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		while(n>0) {
			int num = n%10;
			int fact = 1;
			for(int i=1;i<=num;i++)
			{
				fact*=i;
			}
			System.out.println(fact);
			n=n/10;
		}
		

	}

}
