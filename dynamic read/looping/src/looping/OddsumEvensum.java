package looping;
import java.util.Scanner;
public class OddsumEvensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n =  s.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		
		while(n>0)
		{
			int r=n%10;
			if(r%2==0)
				evenSum+=r;
			else
				oddSum+=r;
			n=n/10;
		}
		System.out.println(evenSum);
		System.out.println(oddSum);
		
	}

}
