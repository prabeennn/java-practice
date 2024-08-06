package exceptionHandling;

public class Try_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Starts");
		try {
			//int res=10%0;   // for Arithmetic block
			String s="Jspiders";
			char[] ch=s.toCharArray();
			System.out.println(ch.length);
			//System.out.println(s.charAt(9));   //9 index value not present so StringIndex
			System.out.println(ch[12]);  // as its out of range itt will throw ArrayIndex Block
			
			
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Block");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndex Block");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndex Block");
		}
	}

}
