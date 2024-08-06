package looping;

public class FactorsofGivenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12;
		int count =0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				count++;
			
		}
		System.out.println(count);
		
		

	}

}
