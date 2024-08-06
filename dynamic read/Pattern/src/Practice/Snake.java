package Practice;

public class Snake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				int k=n*(i-1)+1;
				for(int j=1;j<=5;j++) {
					System.out.print(k++ +"\t");
				}

				}
			else{
				int k=n*i;
				for(int j=1;j<=5;j++) {
					System.out.print(k--+"\t");
				}
			}
			System.out.println();
			
		}

	}
	}


