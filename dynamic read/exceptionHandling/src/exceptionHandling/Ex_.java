package exceptionHandling;

public class Ex_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
		}
		//catch(NullPointerException e) {   // if the excxception is handled It will not check for next catch block
			//System.out.println("Handled");
		//}
	}

}
