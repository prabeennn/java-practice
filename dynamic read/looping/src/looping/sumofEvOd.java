package looping;
import java.util.Scanner;
public class sumofEvOd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the range");
		Scanner scn = new Scanner(System.in);
		 int a= scn.nextInt();
		 int b= scn.nextInt();
		 
		 int oddsum=0;
		 int evensum=0;
		 for(int i=a;i<=b;i++)
		 {
			 if(i%2==0)
				 oddsum+=i;
				 else
					 evensum+=i;
	}
		 System.out.println(oddsum);
		 System.out.println(evensum);

	}

}
