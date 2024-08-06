package recurtion;
import java.util.Scanner;
public class PrintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number");
		Scanner scn=new Scanner(System.in);
		int end=scn.nextInt();
		display(1,end);
	}
	static void display(int n,int end)
	{
		if(n>end)return;
		System.out.println(n);
		display(n+1,end);
		

	}

}
