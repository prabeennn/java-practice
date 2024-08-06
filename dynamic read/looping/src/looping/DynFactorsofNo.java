package looping;
import java.util.Scanner;
public class DynFactorsofNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count= 0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				count++;
		}
			System.out.println(count);
			
				
			
		
		

	}

}
