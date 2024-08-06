package conditionalOperator;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 34;
		int c = 11;
		
		int res = (a<b ? (a<c ? a:c): (b<c ? a:c));
		System.out.println(res);

	}

}
