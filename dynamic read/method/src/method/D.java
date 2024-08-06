package method;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m1());

	}
	static int m1() {
		int a=15;
		if(a%3==1) return 1;
		if(a%5==2) return 23;
		if(a<0) return 32;
		return 34;
	}

}
