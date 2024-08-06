package looping;
import java.util.Scanner;
public class sumofFirfno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int  a=scn.nextInt();
		int sum =0;
		
		for(int i=1;i<=a;i++)
			sum+=i;
		System.out.println(sum);
			
		

	}

}
