package looping;

public class sumofFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		int sum=0;
		for(int i=1;i<=a;i++)
			if(a%i==0)
				sum+=i;
		System.out.println(sum);

	}

}
