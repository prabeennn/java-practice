package looping;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the range");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		int evensum=0;
		int oddsum=0;
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
				evensum+=i;
			else
				oddsum+=i;
				
		}
		System.out.println(evensum);
		System.out.println(oddsum);

	}

}
