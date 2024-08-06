package conditionalOperator;

public class B {

	public static void main(String[] args) {
		
		int a = 23;
		int b = 34;
		int c = 21;
		int res = (a>b ? (a>c ? a:c) : (b>c ? b:c));
		System.out.println(res);

	}

}
